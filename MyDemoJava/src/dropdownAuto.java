

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		
		//static dropdown handling
		//select dropdown with select tag
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//below is address to the dropdown
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//need to create an object for create
		Select dropdown = new Select(staticDropdown);
		//selecting based on index
	    dropdown.selectByIndex(3);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
		//driver.findElement(By.xpath("//div[@class='dropdownDiv'] //a[@value='HYD']")).click();
		//selecting based on text
	    dropdown.selectByVisibleText("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
	    System.out.println(dropdown.getFirstSelectedOption().getText());

		
		
		
	}
}