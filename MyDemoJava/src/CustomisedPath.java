import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class CustomisedPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=au");

		//Customised Xpath for username.
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Enter Username here");
	// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	//  driver.findElement(By.xpath("//input[@id='Login']")).click();
	//  System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
	
		//Customised CssSelector path.
	  driver.findElement(By.cssSelector("input[id='username']")).sendKeys("ENter");
	  driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
	//another way to create cssselector path below
	  driver.findElement(By.cssSelector("input#id")).click();
	  System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());
	  
	  
	  //regular Expression
	  driver.findElement(By.cssSelector("input[id='username']")).sendKeys("ENter");
	  driver.findElement(By.cssSelector("input[id='password']")).sendKeys("password");
	//another way to create cssselector path below
	  driver.findElement(By.cssSelector("input#id")).click();
	  
	  
	  
driver.close();
	}
}