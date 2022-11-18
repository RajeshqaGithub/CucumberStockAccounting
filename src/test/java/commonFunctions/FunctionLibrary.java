package commonFunctions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionLibrary {
static WebDriver driver;
	
	public static WebDriver startBrowser() throws Exception{
				
			 driver =new ChromeDriver();	
		
		return driver;
	}
	
	public static void openApplication(WebDriver driver) throws Exception{
		driver.get("http://webapp.qedgetech.com/");	
		driver.manage().window().maximize();
	}
	
	// method For Wait Any eliment
	public static void waitForElement(WebDriver driver,String locatortype,String locatorvalue,String waittitme){
			
			WebDriverWait mywait=new WebDriverWait(driver, Integer.parseInt(waittitme));
			if(locatortype.equalsIgnoreCase("id")){
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
			}
			else if(locatortype.equalsIgnoreCase("xpath")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
			}else if(locatortype.equalsIgnoreCase("name")){
				mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
			}else
			{
			System.out.println("unable to locate for waitForElement method with "+locatortype);
			}			
	}
	//method for clickaction
	public static void clickAction(WebDriver driver,String locatortype,String locatorvalue)
	{
		if(locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).sendKeys(Keys.ENTER);
		}
		else if(locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locatorvalue)).click();
		}
		else if(locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).click();
	}
		else{
		System.out.println("Unable to locate for ClickAction method");	
		}
	}
//	Method For TypeAction
	public static void typeAction(WebDriver driver,String locatortype,String locatorvalue,String testdata){
		if(locatortype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(locatorvalue)).clear();
			driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(locatorvalue)).clear();
			driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
		}
		else if(locatortype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(locatorvalue)).clear();
			driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
		}else
		{
			System.out.println("unable to locate for typeAction method with "+locatortype);
		}		
	}
//	Capture Supplier Number And Save Into Notepad
	public static void captureData(WebDriver driver,String locatortytpe,String locatorvalue) throws Exception{
		
		String supplierdata="";
		
		if(locatortytpe.equalsIgnoreCase("id")){
			supplierdata=driver.findElement(By.id(locatorvalue)).getAttribute("value");
		}
		
		else if(locatortytpe.equalsIgnoreCase("xpath")){
			supplierdata=driver.findElement(By.xpath(locatorvalue)).getAttribute("value");
		}
		
		else if(locatortytpe.equalsIgnoreCase("name")){
			supplierdata=driver.findElement(By.name(locatorvalue)).getAttribute("value");
		}
		
		FileWriter fw=new FileWriter (System.getProperty("user.dir")+"\\CaptureData\\suppnumber.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(supplierdata);
		bw.flush();
		bw.close();	
	}
//Read Data form NotePad
	public static void tableValidation(WebDriver driver,String column) throws Exception{
		

		FileReader fr=new FileReader("./CaptureData/suppnumber.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String Exp_data=br.readLine();
		
		if(driver.findElement(By.xpath("//*[@id='psearch']")).isDisplayed()){
			driver.findElement(By.xpath("//*[@id='psearch']")).clear();
			driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
			driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
			
			
		}else{
			driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[2]/div[2]/div/button/span")).click();
			driver.findElement(By.xpath("//*[@id='psearch']")).clear();
			driver.findElement(By.xpath("//*[@id='psearch']")).sendKeys(Exp_data);
			driver.findElement(By.xpath("//*[@id='btnsubmit']")).click();
		}
		
		WebElement table=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']"));
		
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++){
			
			String act_data=driver.findElement(By.xpath("//table[@id='tbl_a_supplierslist']/tbody/tr["+i+"]/td["+column+"]/div/span/span")).getText();
			
			Assert.assertEquals(act_data, Exp_data);
			
			System.out.println(act_data+"   "+Exp_data);
			break;		
		}
		
}
	public static void validatetitle(WebDriver driver)
	{
		String expectedTitle =  "Dashboard « Stock Accounting";
		String actualTitle = driver.getTitle();
		try {
			Assert.assertEquals(expectedTitle, actualTitle,"Title is Not Matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		System.out.println(expectedTitle+"::::::::::::::"+actualTitle);
	}
}
