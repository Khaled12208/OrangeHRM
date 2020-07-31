package TestCasesRepository;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectRepository.LoginPage;

public class LoginTest extends TestBase {

    // test case for verifying the login Panel is Displayed
    @Test(priority = 1)
    public void VerifyLoginPanel() {
	// create an object from the login page class
	LoginPage Login = new LoginPage(driver.get());
	// assert that login panel is displayed to LOGIN Panel
	Assert.assertEquals(Login.LoginPanelTitle(), "LOGIN Panel");

    }

    // test case for verifying the login functionality with valid data
    @Test(priority = 2)
    public void loginWithValidData() {
	// create an object from the login page class
	LoginPage Login = new LoginPage(driver.get());
	Login.SendUserName("admin");
	Login.SendPassword("admin123");
	Login.ClickLoginButton();
	// assert that the user has been redirected to OrangeHRM
	Assert.assertEquals(Login.PageTitl(driver.get()), "OrangeHRM");

    }

    // test case for verifying the login functionality with invalid data
    @Test(priority = 0) // Priority is set to 0 to make sure that the this test will execute first
    public void loginWithInvalidData() {
	// create an object from the login page class
	LoginPage Login = new LoginPage(driver.get());
	Login.SendUserName("admin");
	Login.SendPassword("12344");
	Login.ClickLoginButton();
	// assert that invalid message displayed
	Assert.assertEquals(Login.SpanMessage(), "Invalid credentials");

    }

}
