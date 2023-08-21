package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache3 {

	public static void main(String[] args) throws Exception {
		// create object for open xls
		FileInputStream stream = new FileInputStream(new File("E:/Selenium/Data.xlsx"));

		// opject for open workbook
		XSSFWorkbook xb = new XSSFWorkbook(stream);// XSSFWorkboo is a class
		XSSFSheet sh = xb.getSheet("Sheet1");

		System.out.println(sh.getSheetName());

		int rows = sh.getLastRowNum();

		System.out.println("Total Rows:"+rows);

		int cols = sh.getRow(0).getLastCellNum();

		System.out.println("Total Coloms:"+cols);

		for (int r = 1; r <=rows; r++) {//loop for calculate row
			XSSFRow row = sh.getRow(r);
			
			for (int c = 0; c < cols; c++) {
				XSSFCell cell=row.getCell(c);
				
				switch(cell.getCellType())
				{
				
				case STRING : System.out.print(cell.getStringCellValue().toString()); break;
				case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
				case NUMERIC : System.out.print((int)cell.getNumericCellValue()); break;
				default:
					break;
				
				
				}
				
				System.out.print(" | ");
			}
			System.out.println("  ");

		}
	}

}
