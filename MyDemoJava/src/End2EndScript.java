import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class End2EndScript {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://spicejet.com");
		
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		//************************ Auto DropDown ************************************************
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		//************************calender current Date************************
		
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();	

		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();		

		  if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		    {
			  System.out.println(" itsEnabled");
			  Assert.assertTrue(true);
		    }
		    else 
		    {
			  Assert.assertTrue(false);
		    }
	   // ************************Another DropDown********************************************
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		 for(int i=1;i<5;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		// ************************Check Box********************************************
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//to check the check box is selected or not
	    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        // counting number of check boxes.
	    //find out the common locator for all the checkboxes.
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	    /********************************************Radio Buttons********************************************
	//    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	    //checking disabled calender
	    System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	    //  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	    
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	    {
		  System.out.println("Enabled");
		  Assert.assertTrue(true);
	    }
	    else 
	    {
		  Assert.assertTrue(false);
	    }*/
		
	    //******************************************Static DropDown********************************************

	    
	    WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//need to create an object for create
		Select dropdown = new Select(staticDropdown);
		//selecting based on index
	    dropdown.selectByIndex(3);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
		
	    //************************************* search option *************************************
	    driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
	 //   driver.findElement(By.cssSelector("input[value='Search']")).click();
	 //   driver.findElement(By.xpath("input[@value='Search']")).click();


	
}
}
