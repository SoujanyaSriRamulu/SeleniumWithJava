import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class productDetails{

    public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
        driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9337276560");
        driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.name("q")).sendKeys("apple laptops",Keys.ENTER);
        Thread.sleep(2000);

        List<WebElement> vs = driver.findElements(By.xpath("//div[@class='_1UoZlX']"));
        System.out.println("total no of value"+vs.size());
        for (WebElement product : vs) {
            System.out.println(product.getText());
            System.out.println("<======================================>");
        }
    }


}
