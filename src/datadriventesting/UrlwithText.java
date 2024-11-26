package datadriventesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlwithText {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int nooflinks=links.size();
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("FlipkartLinks1");
		for(int i=0; i<nooflinks; i++)
		{
			WebElement link=links.get(i);
			String url=link.getText();
			XSSFRow row=sheet.createRow(i);
			XSSFCell cel=row.createCell(0);
			cel.setCellValue(url);
		}
		FileOutputStream fos=new FileOutputStream("./testdata/flipkartlinks1.xlsx");
		book.write(fos);
		book.close();
		fos.close();
		Thread.sleep(2000);
		driver.close();
	}

}
