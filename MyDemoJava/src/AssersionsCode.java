import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//testNG is one of the testing framework
public class AssersionsCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	//the cehck box is not selected so assertion is false..it return false..
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
       //the check box is selected so assersion is true so it returns true.
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		//Assert.assertEquals(driver.findElement(By.id("divpainfo")).getText(), "5 Adults)
		
		//assersions---help us to validate results with expected results
	   
		
	}
}