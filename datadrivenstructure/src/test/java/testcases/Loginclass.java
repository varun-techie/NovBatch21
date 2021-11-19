package testcases;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import functionalreuable.Loginmodule;
import pages.Homepages;
import pages.Loginpages;
import pages.Thirdpages;
import reusables.Genericwrapper;
import utilities.Excelreader;
import utilities.Propreader;

public class Loginclass {
	
	
	Genericwrapper gw= new Genericwrapper();
	Propreader pr= new Propreader();
	Loginmodule lm = new Loginmodule();
	
	
	//user story 1,alt+shift+j
	/**
	 * @author varun
	 * this method is used to login my application
	 * @param pass content from commonmethods
	 * @throws IOException 
	 */
	public void firstcase() throws IOException {
		
		
		
		gw.getmyurl("chrome", "http://automationpractice.com/index.php");//excel read
		gw.click(pr.getobjects("signin"));//property
		gw.entertext(pr.getobjects("username"), "");
		//gw.dropdown(locator, index);
		
			
	}
	
	//dataprovider
	@Test(dataProviderClass = Excelreader.class,dataProvider = "myownfile",enabled=false)
	public void secondcase(String myvalue) {
		
		System.out.println(myvalue);
		
	}
	
	
	@Test(dataProviderClass = Excelreader.class,dataProvider="readexcel",enabled=false)
	public void thirdcase(Map<Object,Object> data) throws IOException, InterruptedException {
		
		//System.out.println(data.get("Browser").toString());
		gw.getmyurl(data.get("Browser").toString(), data.get("url").toString());
		gw.click(pr.getobjects("signin"));
		Thread.sleep(4000);
		gw.entertext(pr.getobjects("email"), data.get("email").toString());
		
		lm.treefunctionality();
		
		
		
		
	}
	
	@Test(dataProviderClass = Excelreader.class,dataProvider="readexcel")
	public void fourthcase(Map<Object,Object> data) throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		Loginpages lp= new Loginpages();
		//Loginpages lpp =PageFactory.initElements(Webdriver driver, LoginPages.class)
		lp.clicksigin(data);
		lp.enteremail(data);
		
		//classname ref= new classname
		Homepages hp=lp.clicklink();//new homepages
		hp.dummy();
		
		Thirdpages tp =hp.clickdummy();
		
		
		
		String mywebtext=lp.getAuthtext();//website
		//client--
		Assert.assertEquals(mywebtext, data.get("actualtext").toString());
		Assert.assertEquals(mywebtext,"am here");
		
		soft.assertEquals("", "");
		Assert.assertTrue(19>18, "yes its true");
		soft.assertEquals("", "");
		
		
		
	soft.assertAll();	
	}
	
	
	public void fifthcase() {
		
		Loginpages lp = new Loginpages();
		//lp.clicksigin(data);//locator
	}
	
	
	

}
