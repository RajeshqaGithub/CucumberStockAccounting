package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SupplierSteps {
	WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	   driver =FunctionLibrary.startBrowser();
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    FunctionLibrary.openApplication(driver);
	}

	@When("^Wait For Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Username_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	    }

	@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Username_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.typeAction(driver, Locatortype, Locatorvalue, "admin");
	}

	@When("^Enter Password with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_Password_with_and(String Locatortype, String Locatorvalue) throws Throwable {
		FunctionLibrary.typeAction(driver, Locatortype, Locatorvalue, "master");

	}

	@When("^Click On Login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Login_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	  FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);  
	}

	@When("^Wait For Supplier with \"([^\"]*)\" and\"([^\"]*)\"$")
	public void wait_For_Supplier_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Click On Supplier with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Supplier_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	   FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);
	}

	@When("^Wait For AddButton with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_AddButton_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Click On AddButton with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_AddButton_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);
	}

	@When("^Wait For SupplierNumber with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_SupplierNumber_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	   FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@Then("^Capture Data with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void capture_Data_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.captureData(driver, Locatortype, Locatorvalue);
	}

	@When("^Wait For SupplierName with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_SupplierName_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	   FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_in_with_and(String testData,String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.typeAction(driver, Locatortype, Locatorvalue, testData);
	    }

	@When("^Wait For Add Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Add_Button_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	    FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Click On Add Button after adding notes with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Add_Button_after_adding_notes_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	   FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);
	}

	@When("^Wait For Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Ok_Button_with_and(String Locatortype, String Locatorvalue) throws Throwable {
	   FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Click On Ok Button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Ok_Button_with_and(String Locatortype, String Locatorvalue) throws Throwable {
		 FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);
	}

	@When("^Wait For Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_For_Alert_with_and(String Locatortype, String Locatorvalue) throws Throwable {
		FunctionLibrary.waitForElement(driver, Locatortype, Locatorvalue, "10");
	}

	@When("^Click On Alert with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_On_Alert_with_and(String Locatortype, String Locatorvalue) throws Throwable {
		 FunctionLibrary.clickAction(driver, Locatortype, Locatorvalue);
	}

	@Then("^user validate the supplier table$")
	public void user_validate_the_supplier_table() throws Throwable {
	    FunctionLibrary.tableValidation(driver, "6");
	}

	@When("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
	   driver.close();
	}


}

