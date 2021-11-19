package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserbase {

	
		//dummydriver
		//webdriver--reference
		static ChromeDriver chrome;
		static FirefoxDriver ff;
		static WebDriver driver;
		
		public static WebDriver launchbrowser(String input) {
			
				
			
			if(input.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\sepbatchdriver\\chromedriver.exe");//dummy pointing
				 driver =new ChromeDriver();
				 
			}else if(input.equals("ff")) {
				
				
				System.setProperty("webdriver.gecko.driver", "D:\\sepbatchdriver\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			
			//edge and IE----
			
		return driver;	
		}
		
		
	}


