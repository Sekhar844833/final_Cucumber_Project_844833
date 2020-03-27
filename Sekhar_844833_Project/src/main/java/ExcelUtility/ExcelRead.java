package ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
					// To read Username from the sheet
	public  String excel_username(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\Exceldata.xlsx"));
		  XSSFWorkbook c = new XSSFWorkbook(fil);
		  XSSFSheet sheet=c.getSheetAt(0);
		  String un=sheet.getRow(a).getCell(0).getStringCellValue();
		  c.close();
		  return un;
}
	public  String excel_password(int b) throws IOException {
					// To read Password from the sheet
		  
		  FileInputStream fil = new FileInputStream(new File("src\\test\\resources\\TestData\\Exceldata.xlsx"));
		  XSSFWorkbook d = new XSSFWorkbook(fil);
		  XSSFSheet sheet=d.getSheetAt(0);
		  String pwd=sheet.getRow(b).getCell(1).getStringCellValue();
		  d.close();
		  return pwd;
}
}