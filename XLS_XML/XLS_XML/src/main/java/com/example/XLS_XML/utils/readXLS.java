package com.example.XLS_XML.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.XLS_XML.models.employes;


public class readXLS {
	public ArrayList<employes> leerXLS(String rutaEntrada) throws IOException{
		
		ArrayList<employes> salida=new ArrayList<>();
		
		InputStream myFile = new FileInputStream(new File(rutaEntrada));
	    @SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(myFile);
	    XSSFSheet sheet = wb.getSheetAt(0);
	
	    @SuppressWarnings("unused")
		XSSFCell cell;
	    XSSFRow row;	
	
	    for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {
	        row = sheet.getRow(i);
	       
	        String eeid = row.getCell(0).toString();
	        String fullName = row.getCell(1).toString();
	        String jobTitle = row.getCell(2).toString();
	        String department = row.getCell(3).toString();
	        String businessUnit = row.getCell(4).toString();
	        String gender = row.getCell(5).toString();
	        String ethnicity = row.getCell(6).toString();
	        String ageStr = row.getCell(7).toString();
	        String hireDate = row.getCell(8).toString();
	        String annualSalaryStr = row.getCell(9).toString();
	        String bonusPercentageStr = row.getCell(10).toString();
	        String country = row.getCell(11).toString();
	        String city = row.getCell(12).toString();
	        String exitDate = row.getCell(13).toString();
	            
	            employes Miemployes = new employes(eeid,fullName,jobTitle
	            													,department,businessUnit,gender,ethnicity,ageStr,
	            													hireDate,annualSalaryStr,bonusPercentageStr,country,
	            													city,exitDate);
	            Miemployes.toString();
	            
            salida.add(Miemployes);
            
	        }
	    
		return salida;
	
	
	}
}
		
	
