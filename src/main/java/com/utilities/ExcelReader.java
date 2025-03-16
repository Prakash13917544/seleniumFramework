package com.utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public FileInputStream fis;
    public  Workbook workbook;
    public  Sheet sheet;
    public  String cellvalue;
	
	public ExcelReader() throws IOException {
		//Open the Excel file
        try {
			 fis= new FileInputStream(new File("C:\\Users\\prakash.pampanagowda\\eclipse-workspace\\seleniumframework\\src\\test\\resources\\testdata\\TestData.xlsx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Create a Workbook instance (XSSFWorkbook for .xlsx files)
        workbook = new XSSFWorkbook(fis);
		
		}
	
	public String getExcelData(String SheetName,int row,int col) {
		
		
		 // Get the first sheet from the workbook
        try {
        	
			sheet = workbook.getSheet(SheetName);
			cellvalue= sheet.getRow(row).getCell(col).getStringCellValue();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cellvalue;
		 
	}
	
	
	
	
}
