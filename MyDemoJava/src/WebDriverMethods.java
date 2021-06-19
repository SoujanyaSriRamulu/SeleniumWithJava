import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverMethods {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "//Users//sr20015260//eclipse-workspaceNew//chromedriver");    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//getTitle= validate if your page title is correct
		System.out.println(driver.getTitle()); 
		
		//getCurrentUrl= checking weather we are landing on the correct URL or not.
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource= to print pageSource, in banking wepages rightclick will be disabled.
		//System.out.println(driver.getPageSource());
		
		driver.get("https://yahoo.com");
		driver.navigate().back();
		
		
	}

}
