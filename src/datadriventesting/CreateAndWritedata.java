package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWritedata {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Automation Framework");
		XSSFRow row=sheet.createRow(0);
		XSSFCell cel=row.createCell(0);
		cel.setCellValue("Automation class");
		FileOutputStream fos=new FileOutputStream("./testdata/Framework.xlsx");
		workbook.write(fos);
		workbook.close();
		fos.close();
	}

}
