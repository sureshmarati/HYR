package testPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingMultiple {

	public static void main(String[] args) throws Exception {
		File excelpath = new File("C:\\Users\\marat\\eclipse-workspace\\HYR\\ExcelData\\In.xlsx");
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rc = ws.getLastRowNum();
		for(int i=0; i<=rc; i++)
		{
			String d = ws.getRow(i).getCell(0).getStringCellValue();
			String E = ws.getRow(i).getCell(3).getStringCellValue();
			System.out.println(d+"  "+E);
			
		}
	}

}
