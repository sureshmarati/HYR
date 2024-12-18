package testPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingInExcel {

	public static void main(String[] args) throws Exception {
		File excelpath = new File("C:\\Users\\marat\\eclipse-workspace\\HYR\\ExcelData\\In.xlsx");
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		ws.getRow(0).createCell(4).setCellValue("Baby");
		ws.getRow(1).createCell(4).setCellValue("Surya");
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		String er= ws.getRow(0).getCell(4).getStringCellValue();
		String rt= ws.getRow(1).getCell(4).getStringCellValue();
		System.out.println(er+"  "+rt);
	}

}
