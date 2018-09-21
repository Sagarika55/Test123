package DataproviderTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcel {
	XSSFWorkbook rwb;
	XSSFSheet rsh;
	String data;
	File f;
	public TestExcel(String excelpath){
		try {
			f=new File(excelpath);
			FileInputStream fis=new FileInputStream(f);
			rwb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	public String readData(int sheet,int row,int col){
		rsh=rwb.getSheetAt(sheet);
		try {
			data=rsh.getRow(row).getCell(col).getStringCellValue();
			
		} catch (Exception e) {
		}
		return data;
	}
	public void writeData(int sheetno,int row,int col,String data1){
		rsh=rwb.getSheetAt(sheetno);	
		rsh.getRow(row).createCell(col).setCellValue(data1);
		System.out.println("success");
		
		FileOutputStream fout;
		try {
			fout = new FileOutputStream(f);
			rwb.write(fout);
		} catch (Exception e) {
			
		}
		
	}

}
