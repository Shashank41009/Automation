package assignmentClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static void main(String[] args) throws IOException {
		
	

		FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
		
		 Workbook file = WorkbookFactory.create(fis);
				String file1 = file.getSheet("CustomerSheet").getRow(1).getCell(2).getStringCellValue();
		System.out.println(file1);
		
		
}}
