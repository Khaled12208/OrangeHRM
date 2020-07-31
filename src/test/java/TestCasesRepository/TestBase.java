package TestCasesRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    public ThreadLocal<WebDriver> driver; // make the driver a thread safe variable

    @BeforeTest
    public void Browser_Init() {
	String DriverPath; // driver path variable
	driver = new ThreadLocal<WebDriver>(); // cread a thread for the webdriver
	DriverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe"; // get the driver directory
	System.setProperty("webdriver.chrome.driver", DriverPath); // set the driver
	driver.set(new ChromeDriver()); // creat a new driver object

	/* to make each every test cases wait */
	driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/* Maximize the browser page */
	driver.get().manage().window().maximize();
	/* navigate to Orange HRM website */
	driver.get().get("https://opensource-demo.orangehrmlive.com/");

    }

    @AfterTest
    public void Browser_Teardown() {

	driver.get().quit();

    }

}
