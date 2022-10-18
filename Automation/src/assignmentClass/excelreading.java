package assignmentClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelreading {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/Book1.xlsx");
		
		   Workbook wb = WorkbookFactory.create(fis);
				   wb.getSheet("CustomerSheet").getRow(1).getCell(2).setCellValue("HDFCB");
		
		 
		 FileOutputStream fos = new FileOutputStream("./data/Book1.xlsx");
		 WorkbookFactory.create(fis).write(fos);
		 wb.close();
		 
	}
}
