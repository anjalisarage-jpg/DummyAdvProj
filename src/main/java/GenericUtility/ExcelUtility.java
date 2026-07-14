package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String toReadDataFromExcel(String sheetname,int row, int cell) throws Throwable
	{
		FileInputStream fis1= new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		String data =wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	public int toReadLastRowNum(String sheetname) throws Throwable
	{
		FileInputStream fis1= new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		Sheet sh = wb.getSheet(sheetname);
		int rowcount = sh.getLastRowNum();
		return rowcount;
	}
	
	

}
