package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(id= "email")
	private WebElement UN_ele;
	
	@FindBy(id= "pass")
	private WebElement PWD_ele;
	
		@FindBy(name= "login")
		private WebElement btn_ele;
	
		public POM(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

}
