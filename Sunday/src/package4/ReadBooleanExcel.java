package package4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadBooleanExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("C:\\Chandan\\Sunday\\Sunday\\exefiles\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		Cell cl = rw.getCell(5);
		boolean boolValue = cl.getBooleanCellValue();
		System.out.println(boolValue);
		
		

	}

}
