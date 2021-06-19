

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Cowin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cowin.gov.in/home");
		//System.out.println(driver.findElement(By.cssSelector(".row.ng-star-inserted")));
		driver.findElement(By.className("mat-tab-label-content")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("500032");
		driver.findElement(By.xpath("//button[@class='pin-search-btn']")).click();
	//System.out.println(driver.findElement(By.xpath("//div[@class='center-box']/div/div/div[1]/div/div/div[1]/div/h5")));
     //  driver.findElement(By.className("center-name-title")).getText();
		//driver.findElement(By.className(".row.ng-star-inserted h5")).getText();
	//	("h5.center-name-title")
		
		//("//div[@class='row-disp'] //h5[@class='center-name-title']")
	//	driver.findElements(By.className(".row.ng-star-inserted h5"))
		
  List<WebElement> vs = driver.findElements(By.xpath("//div[@class='row-disp'] //h5[@class='center-name-title'].*"));
	   // List<WebElement> vs = driver.findElements(By.xpath("//div[@class='row-disp']"));

		System.out.println(vs.size());
    
 for (WebElement hospital : vs) {
        	System.out.println(hospital.getText());
        }
        	
        
	}
	}
	

