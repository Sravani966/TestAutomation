package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfiledata {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(3);
		XSSFCell cel=row.getCell(1);
		String val=cel.getStringCellValue();
		System.out.println(val);
		
		workbook.close();
		fis.close();
	}

}
