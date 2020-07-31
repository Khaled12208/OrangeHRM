package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    // this function is used to perform click operation
    public void click_Element(WebElement Element) {

	Element.click();
    }

    // this function is used to Send data to textbox
    public void Send_Keys(WebElement Element, String values) {

	Element.sendKeys(values.trim());
    }

    // this function is used to Select from Static drop dwon list
    public void Select_value(WebElement Element, String values) {
	Element.click();
	Select s = new Select(Element);
	s.selectByVisibleText(values);
    }

    // this function is used to read text from webelement
    public String get_text(WebElement Element) {

	return Element.getText();

    }

    // this function is used to get the page title
    public String PageTitl(WebDriver Driver) {

	return Driver.getTitle();

    }

}
