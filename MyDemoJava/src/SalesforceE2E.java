
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class SalesforceE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
   driver.findElement(By.cssSelector("a[title*='Sign in']")).click();;
driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Enter UserName");

	//driver.findElement(By.xpath("input[contains(@id,'login1')]")).sendKeys("Enter UserName");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Enter Password");;
	driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
//	driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	System.out.println(driver.findElement(By.xpath("//div[@id='div_login_error']")).getText());

driver.close();
	}
}