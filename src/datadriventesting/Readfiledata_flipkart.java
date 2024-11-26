package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Readfiledata_flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement search=driver.findElement(By.id("email"));
		WebElement search1=driver.findElement(By.id("pass"));
		
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(2);
		XSSFCell cel=row.getCell(1);
			
		XSSFRow row1=sheet.getRow(1);
		XSSFCell cel1=row1.getCell(1);
		String val=cel.getStringCellValue();
		String val1=cel1.getStringCellValue();
		//System.out.println(val);
		search.sendKeys(val);
		System.out.println(val);
		search1.sendKeys(val1);
		System.out.println(val1);
		//search1.sendKeys("abc@123");
		
		
		workbook.close();
		fis.close();
		
	}

}
