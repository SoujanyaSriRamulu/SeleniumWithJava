import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SOUJIbava Forever");

		//selenium code we can write here
		
		//create Driver object for Chrome
		//Java accepts // for path, for / it takes a special char only
		
		System.setProperty("webdriver.chrome.driver", "//Users//sr20015260//eclipse-workspaceNew//chromedriver");    
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); //open the web page in Chrome
		System.out.println(driver.getTitle()); //get the title of the web page Ex: Google
		
		
	}

}
