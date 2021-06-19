
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
public class WriteDataCowin {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "//Users//sr20015260//eclipse-workspaceNew//geckodriver");    
		WebDriver driver = new FirefoxDriver();
		
		 
		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet1 = workbook.createSheet("Sheet1");
		 Row row= sheet1.createRow(0);
		 Cell cell =row.createCell(0);
		 
		 
		 
		 
		 
		 
	
        	
        
	}
	}
	
