package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApplicationLogin_Steps {
WebDriver driver;
@When("^Open Browser$")
public void open_Browser() throws Throwable {
    driver =FunctionLibrary.startBrowser();
}

@When("^Open Application$")
public void open_Application(WebDriver driver) throws Throwable {
   FunctionLibrary.openApplication(driver);
}

@When("^Wait For Username With \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_Username_With_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, "10");
}

@When("^Enter Username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_Username_with_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.typeAction(driver, locatortype, locatorvalue, "admin");
}

@When("^Enter Password with \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_Password_with_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.typeAction(driver, locatortype, locatorvalue, "master");
}

@When("^Click On Login Button With \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_On_Login_Button_With_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^Wait For Logout Link With \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_For_Logout_Link_With_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, "10");
}

@Then("^User Validate The Dashboad Page Title$")
public void user_Validate_The_Dashboad_Page_Title() throws Throwable {
    FunctionLibrary.validatetitle(driver);
}

@When("^Click Logout Link With \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Logout_Link_With_and(String locatortype, String locatorvalue) throws Throwable {
    FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
}

@When("^Close Browser$")
public void close_Browser() throws Throwable {
    driver.close();
}

}
