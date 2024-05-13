package com.outreach.Utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excel_data{
public String[] excel_read() throws IOException {
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\data\\data.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");  
	

	int totalcells=sheet.getRow(1).getLastCellNum();
	
	String d[]= new String[totalcells];
	
		XSSFRow currentRow=sheet.getRow(1);
				
		for(int c=0;c<totalcells;c++)
		{
			
			String value=currentRow.getCell(c).toString();
			System.out.println(value);
			d[c]=value;
		}
		System.out.println();
	
	workbook.close();
	file.close();
	return d;
	
	
}

public void write_data(String data[],String result) throws IOException {
	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\data\\result.xlsx"); 

	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet();
	int lastRow = sheet.getLastRowNum();
	
	for(int i=0; i<=lastRow; i++)
	{
		XSSFRow row = sheet.getRow(i);
		XSSFCell cell = row.createCell(2);
	
		cell.setCellValue("WriteintoExcel");

	}
	
	
//	XSSFWorkbook workbook=new XSSFWorkbook();
//	
//	XSSFSheet sheet=workbook.createSheet();
//	
//
//	XSSFRow row1=sheet.createRow(0);
//			
//	row1.createCell(0).setCellValue("Course");
//	row1.createCell(1).setCellValue("City");
//	row1.createCell(2).setCellValue("Test result");
//	
//	XSSFRow row2=sheet.createRow(1);
//	
//	row2.createCell(0).setCellValue(data[0]);
//	row2.createCell(1).setCellValue(data[1]);
//	row2.createCell(2).setCellValue(result);
	

	
	workbook.write(file);
	workbook.close();
	file.close();

	
}


}
