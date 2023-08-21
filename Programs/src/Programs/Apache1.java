package Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
FileInputStream fis=new FileInputStream(new File("E:\\Selenium\\Data.xlsx"));
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		
		System.out.println(rows);
		
		int cols=sheet.getRow(0).getLastCellNum();
		
		System.out.println(cols);
		
		for(int r=1;r<=rows;r++)
		{
			
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.getCell(c);
				
				
				
				/*
				 * String user=cell.getStringCellValue().toString(); String
				 * pass=cell.getStringCellValue().toString(); String
				 * mob=cell.getStringCellValue().toString(); String
				 * email=cell.getStringCellValue().toString();
				 */
				
				switch(cell.getCellType())
				{
				
				case STRING : System.out.print(cell.getStringCellValue()); break;
				case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
				case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
				
				//case default : System.out.println(""); break;
				}
				
				
				System.out.print(" | ");
				
			}
			
			System.out.println();
		}
		
		
		
	

	}

}
