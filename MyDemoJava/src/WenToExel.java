import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
@SuppressWarnings("unused")
public class WenToExel {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.cowin.gov.in/home");
	     String path = "//Users//sr20015260//eclipse-workspaceNew//cowin.xlsx";
		 FileInputStream fs = new FileInputStream(path);
		 @SuppressWarnings("resource")
		 Workbook wb = new XSSFWorkbook(fs);
		 @SuppressWarnings({ "unused" })
		 org.apache.poi.ss.usermodel.Sheet sheet1 =wb.createSheet();
		
		driver.findElement(By.className("mat-tab-label-content")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("500032");
		driver.findElement(By.xpath("//button[@class='pin-search-btn']")).click();
	
		
        List<WebElement> vs = driver.findElements(By.xpath("//div[@class='row-disp'] //h5[@class='center-name-title']"));

		System.out.println(vs.size());
		int i=1;
		
        Row row;
		Cell cell;
		//writing heading in row[0]col[0] 
		row = sheet1.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Vaccination Centers");
        for(WebElement hospital : vs) {
	         row = sheet1.createRow(i++);
    	     cell = row.createCell(0);
  	         cell.setCellValue(hospital.getText());
	
	  }
      FileOutputStream fos = new FileOutputStream(path);
      wb.write(fos);
      fos.close();
        	
        
	}
}
	
