package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@class='Pke_EE']")
	WebElement Searchbox;
	
	public WebElement Searchbox() {
		return Searchbox;
	}
	
	@FindBy(xpath="//span[text()='Fashion']")
	WebElement fashion;
	
	public WebElement garments() {
		return fashion;
	}
	
	@FindBy(xpath="//div[@class='_3jeYYh'][1]")
	WebElement LoginButton;
	
	public WebElement LoginButton() {
		return LoginButton;
	}
	
	@FindBy(xpath = "//span[@class='_30XB9F']")
	WebElement cross;
	
	public WebElement cross() {
		return cross;
	}
	
}

//span[text()='Electronics']
//div/a/span[text()='Login']