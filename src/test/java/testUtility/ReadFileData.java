package testUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadFileData

{

	public static void fetchDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException  
	{
		//String path="C:\\Users\\Administrator\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Book1.xlsx");
		CellType data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getCellType();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
