package basePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFile {

	@Test
	public void ReadingExcel() throws  Exception {
	
	File ExcelFile = new File("C:/Users/ACER-Z3-451/Downloads/Shashi_Folder/Shashi Study Materials/Excel/FileOne.xlsx");
	FileInputStream fis= new FileInputStream(ExcelFile);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wb.getSheet("Sheet1");
	 XSSFCell cell;
	 XSSFRow row;
	 
	 int TotalRows=sheet.getPhysicalNumberOfRows();
	 System.out.println(TotalRows);
		
	 for(int i=0;i<TotalRows;i++) {
		 row=sheet.getRow(i);{
			 for(int j=0; j<row.getLastCellNum();j++) {
				String CellValue= sheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.println("CellValue"+j+" is "+ CellValue);
				}
			 }
		 } 
	 fis.close();	 
	}
	
	@Test
	public void WritingExcel() throws  Exception {	
		File ExcelFile = new File("C:/Users/ACER-Z3-451/Downloads/Shashi_Folder/Shashi Study Materials/Excel/FileOne.xlsx");
		FileInputStream fis= new FileInputStream(ExcelFile);
		
		
		File ExcelFileWritten = new File("C:/Users/ACER-Z3-451/Downloads/Shashi_Folder/Shashi Study Materials/Excel/FileTwo.xlsx");
		FileOutputStream fos= new FileOutputStream(ExcelFileWritten);
	
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wb.getSheet("Sheet1");
	 XSSFCell cell;
	 XSSFRow row;
	 
	 int TotalRows=sheet.getPhysicalNumberOfRows();
	 System.out.println(TotalRows);
		
	 for(int i=0;i<TotalRows;i++) {
		 row=sheet.getRow(i);{
			 for(int j=0; j<row.getLastCellNum();j++) {
				String CellValue= sheet.getRow(i).getCell(j).getStringCellValue();
				 System.out.println("CellValue"+j+" is "+ CellValue);
				 sheet.getRow(i).getCell(j).setCellValue("Shashi");
				 
				}
			 }
		 }
	 	wb.write(fos);
		fos.close();
		fis.close();
	}

	
}
