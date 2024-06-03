package demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingfromexcel {

	private static final CellType STRING = null;
	private static final Object NUMERIC = null;

	public static void main(String[] args) throws IOException {
		String excel="F:\\Workspace\\Demo\\src\\test\\java\\demos\\Family1.xlsx";
		FileInputStream ip=new FileInputStream(excel);
		XSSFWorkbook workbook= new XSSFWorkbook(ip);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalcols=sheet.getRow(1).getLastCellNum();
		Object a[][]=new Object[totalRows][totalcols];
		System.out.println(totalRows);
		System.out.println(totalcols);
		
		int k=0;
		String val1;
		double val2;
		for(int i=1;i<=totalRows;i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<totalcols;j++) {
				XSSFCell cell = row.getCell(j);
				//System.out.println(cell.getCellType());

				if(cell.getCellType().equals(NUMERIC)) {
					
					a[i-1][j]=cell.getNumericCellValue();
				}else {
					a[i-1][j]=cell.getStringCellValue();
				}
				
				
			
			System.out.println(a[0][0]);
		}
		

	}
}
}


