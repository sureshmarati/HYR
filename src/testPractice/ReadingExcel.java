package testPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Throwable {
		File excelpath = new File("C:\\Users\\marat\\eclipse-workspace\\HYR\\ExcelData\\In.xlsx");
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		 String MS=ws.getRow(0).getCell(0).getStringCellValue();
		 String SM=ws.getRow(0).getCell(3).getStringCellValue();
		 System.out.println(MS+SM);
		 
	}

}
