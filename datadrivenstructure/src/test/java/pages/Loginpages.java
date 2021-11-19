package pages;

import java.util.Map;

import reusables.Genericwrapper;
import utilities.Propreader;

public class Loginpages extends Genericwrapper{
	
	Propreader pr= new Propreader();
	//locators as variables
	//public String pwd=pr.getobjects("pwd");
	public String signin="//*[@id='header']/div[2]/div/div/nav/div[1]/a";
	public String email="//*[@id='email']";
	
	
	
	
	//page actions  as methods
	public void clicksigin(Map<Object,Object> data) throws InterruptedException {
		getmyurl(data.get("Browser").toString(), data.get("url").toString());
		sleep(4);
		click(signin);
			
		
	}
	
	
	public String getAuthtext() {
		
		
		return "AUTHENTICATION";
	}
	
	
	public void enteremail(Map<Object,Object> data) {
		
		entertext(email, data.get("email").toString());
	}
	
	
	public Homepages clicklink() {
		//asdas
		///asdasdas
		return new Homepages();
	}

}
