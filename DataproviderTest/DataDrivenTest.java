package DataproviderTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

//import utility.ReadExcel;

public class DataDrivenTest {
	
	static Workbook getWorkBook =null;
	public void  readexcel(String filename, String sheetname) throws IOException
	{
		//create an  object of File class to open xlsx file
		
		File file = new File(filename);
		
		//create object of FileinputStream class to read excel
		
		FileInputStream inputstream = new FileInputStream(file);
		
		//workbook is an interface , XSSFWorkBook and HSSFBook are clasess tht implements workbook interface
		//XSSFWorkbook wrk = new XSSFWorkbook;
		getWorkBook =new XSSFWorkbook(inputstream);		
	//find the file extension by splitting teh filename using substring		
	String filextn = filename.substring(filename.indexOf("."));
		if(filextn.equals(".xlsx"))
		{
			//if it is xlsx file then create obj of XSSFWorkBook class
			getWorkBook = new XSSFWorkbook(inputstream);
	}
		else if (filextn.equals(".xls"))
		{
			//if it is xls file then create obj of HSSFWorkbook class
			getWorkBook = new XSSFWorkbook(inputstream);
		}
		
	
		//read the sheet inside the workbook Sheet interface
		
		Sheet sht = getWorkBook.getSheet(sheetname);
		
		//find no of rows in sheet
				int rwcount =sht.getLastRowNum()-sht.getFirstRowNum();
		
	//take loop to read all teh rows in excel
		String da= null;
		for(int i=0; i<rwcount+1;i++)
		{
			Row allrw =sht.getRow(i);
		
		
	//get the cell value using anotehr loop
			
			for(int j=0; j<allrw.getLastCellNum()-1;j++)
			{
				//print the excel data
				System.out.print(allrw.getCell(j));
				da=allrw.getCell(j).getStringCellValue();
				
			//ystem.out.print(allrw.getCell(j).getStringCellValue()+"||");
		}
		}
		System.out.println();
		//return da;
		
	}
	
	
public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome.driver", "C://Users//sagarika//Downloads//chromedriver_win32//chrome.exe");
	DataDrivenTest obj = new DataDrivenTest();
		obj.readexcel("C:\\Users\\sagarika\\Downloads\\Data.xlsx","Sheet1");
		}

}


