package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws
	EncryptedDocumentException, IOException {
		//step1
		FileInputStream fis=new FileInputStream("./excel/data1.xlsx");
		//step2
		Workbook wb = WorkbookFactory.create(fis);
		//step3
		Sheet sh = wb.getSheet("Sheet1");
		//step4
		Row r = sh.getRow(3);
		//step5
		Cell c = r.getCell(0);
		//step6
		String val = c.toString();
		System.out.println(val);
	}

}
