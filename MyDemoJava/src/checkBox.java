import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class checkBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//to check the check box is selected or not
	    System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
        // counting number of check boxes.
	    //find out the common locator for all the checkboxes.
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).clear();
		//driver.findElement(By.cssSelector("input[id*='Ltc']")).click();
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='Ltc']")).isSelected());

		//radio buttons

	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  //checking disabled calender
	    System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	  //  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    
	  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	  {
		  System.out.println("Enabled");
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.assertTrue(false);
	  }
		
	  driver.close();
		
		
		
	}
}