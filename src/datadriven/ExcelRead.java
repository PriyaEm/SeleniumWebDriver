package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelSheet;
		XSSFCell Cell;
		
		//Location of the excel file
		String path = "C:\\Users\\priya\\eclipse-workspace\\SeleniumWDTutorial\\src\\utilities\\TestData.xlsx";
		String sheetName = "sheet1";
		
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelSheet = ExcelWBook.getSheet(sheetName);
			
			Cell = ExcelSheet.getRow(1).getCell(2);
			String cellData = Cell.getStringCellValue();
			System.out.println("Cell Data: " + cellData);	
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

}
