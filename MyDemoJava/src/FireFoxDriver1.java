import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SOUJIbava Forever");

		//selenium code we can write here
		
		//create Driver object for Chrome
		//Java accepts // for path, for / it takes a special char only
		//set the system property for Firefox browser
		
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		//above 2 teps are importeant for different browsers other code is same for all
		
		driver.get("https://www.google.com/"); //open the web page in Chrome
		System.out.println(driver.getTitle()); //get the title of the web page Ex: Google
		
		driver.get("https://www.eenadu.net/");
		driver.navigate().back();
		
		driver.close();//closes the current browser page
		//driver.quit();//it closes all the browsers opened by selenium script.
		
		
	}

}
