package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipledata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int lr=sheet.getLastRowNum();
		for(int i=0; i<=lr; i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell cel1=row.getCell(0);
			String c1val=cel1.getStringCellValue();
			XSSFCell cel2=row.getCell(1);
			String c1val2=cel2.getStringCellValue();
			System.out.println(c1val+" "+c1val2);
		}
		workbook.close();
		fis.close();
	}
	

}
