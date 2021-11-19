package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Thirdpages {
	
	
	WebDriver driver = new ChromeDriver();
	
	//locators
	By username=By.xpath("testname");
	
	@FindBy(xpath="")
	WebElement uname;
	
	
	
	
	//pageactions	
	public void firstmethod() {
		
	
		uname.click();
		//driver.findElement(username).click();
		
	}
	
	

}
