package com.seleniumpoc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook xworkbook;
	public static XSSFSheet xsheet;
	public static XSSFRow xrow;
	public static XSSFCell xcell;
	
	
	public static int getRowcount(String filpath,String sheetname) throws Exception {
		fis=new FileInputStream(new File(filpath));
		xworkbook=new XSSFWorkbook(fis);
		xsheet=xworkbook.getSheet(sheetname);
		int rownum=xsheet.getLastRowNum();
		xworkbook.close();
		fis.close();
		return rownum;
		
		
	}
	
	public static int getCellcount(String filepath,String sheetname,int rownum) throws Exception {
		fis=new FileInputStream(new File(filepath));
		xworkbook=new XSSFWorkbook(fis);
		xsheet=xworkbook.getSheet(sheetname);
		xrow=xsheet.getRow(rownum);
		int cellcount=xrow.getLastCellNum();
		
		xworkbook.close();
		fis.close();
		return cellcount;
		
	}
	
	public static String getCelldata(String filePath,String sheetname,int rownum,int cellnum) throws Exception {
		fis=new FileInputStream(new File(filePath));
		xworkbook=new XSSFWorkbook(fis);
		xsheet=xworkbook.getSheet(sheetname);
		xrow=xsheet.getRow(rownum);
		xcell=xrow.getCell(cellnum);
		String data;
		try {
			DataFormatter formattedData=new DataFormatter();
			 data=formattedData.formatCellValue(xcell);
				
		}catch (Exception e) {
			return data="";
		}
		xworkbook.close();
		fis.close();
		return data;
		
		
		
		
	}
	
	
	public static void setCelldata(String filePath,String sheetname,int rownum,int cellnum,String data) throws Exception {
		
		fis=new FileInputStream(new File(filePath));
		xworkbook=new XSSFWorkbook(fis);
		xsheet=xworkbook.getSheet(sheetname);
		xrow=xsheet.getRow(rownum);
		xcell=xrow.getCell(cellnum);
		xcell.setCellValue(data);
		fos=new FileOutputStream(new File(filePath));
		xworkbook.close();
		fis.close();
	}
	
	
	

}
