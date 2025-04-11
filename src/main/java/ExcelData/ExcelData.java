package ExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void mydata() throws Exception{
		FileInputStream myfile = new FileInputStream("./src/test/resources/testdata/Book1.xlsx");
		 Workbook mybook = WorkbookFactory.create(myfile);
		String data = mybook.getSheet("sheet1").getRow(0).getCell(1).toString();
		System.out.print(data);
		 
	}
	
	
}

//public static String inputData( String sheet,int row,int cell ) throws EncryptedDocumentException, IOException {
//	
//	FileInputStream file=new FileInputStream("./src/test/resources/testdata/Book1.xlsx");
//	Workbook workbook = WorkbookFactory.create(file);
//	String data = workbook.getSheet(sheet).getRow(row).getCell(cell).toString();
//	return data;