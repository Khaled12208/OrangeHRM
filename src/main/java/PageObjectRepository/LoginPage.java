package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    // define the web element
    protected WebDriver driver;
    By username = By.xpath("//input[@id='txtUsername']");
    By password = By.xpath("//input[@id='txtPassword']");
    By login = By.xpath("//input[@id='btnLogin']");
    By ForgetPassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By SpanMessage = By.xpath("//span[@id='spanMessage']");
    By LoginPanelTitl = By.xpath("//div[@id='logInPanelHeading']");

    // init the local web driver to find the element
    public LoginPage(WebDriver driver) {

	this.driver = driver;

    }

    /* Function to Deal with the WebElements */

    // 1- this function to send password
    public WebDriver SendPassword(String Password) {

	Send_Keys(driver.findElement(password), Password);

	return driver;
    }

    // 2- this function to send Username
    public WebDriver SendUserName(String UerName) {

	Send_Keys(driver.findElement(username), UerName);

	return driver;
    }

    // 3- this function to send Click Forgot Password
    public WebDriver ClickForgotPasswor() {

	click_Element(driver.findElement(ForgetPassword));

	return driver;
    }
    // 4- this function to send Login

    public WebDriver ClickLoginButton() {

	click_Element(driver.findElement(login));

	return driver;
    }

    // 4- get the Span Message Text
    public String SpanMessage() {

	String Message = get_text(driver.findElement(SpanMessage));

	return Message;
    }

    public String LoginPanelTitle() {

	String Message = get_text(driver.findElement(LoginPanelTitl));

	return Message;
    }

}
