import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatorMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=au");
		//driver.findElement(By.id("username")).sendKeys("sriramulasoujanya@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("9492709720");
		//driver.findElement(By.linkText("Forgotten password?")).click();
	//  driver.findElement(By.id("username")).sendKeys("Enter Username");
	//   driver.findElement(By.name("pw")).sendKeys("enter password");
	  // driver.findElement(By.className("button r4 wide primary")).click();
	// driver.findElement(By.name("login")).click();
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Enter");
	//  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("password");
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	  driver.findElement(By.cssSelector("#username")).sendKeys("Email");
	  driver.findElement(By.cssSelector("#password")).sendKeys("password");
	  driver.findElement(By.cssSelector("#Login")).click();
	  System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		
	}
}