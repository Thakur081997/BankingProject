package baseclass;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Screenshotclass {
	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream(Configuration1.excelSheetPath);
		
		Sheet s = WorkbookFactory.create(f).getSheet("sheet2");
		    short s1 = s.getRow(0).getLastCellNum();             //for one row all column values
	         System.out.println(s1);
		
		    for (int i=0; i<=s1-1; i++) {
		
		     String s2 = s.getRow(0).getCell(i).getStringCellValue();
		     System.out.println(s2);
		    }}
	
}
