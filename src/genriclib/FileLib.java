package genriclib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public static String getPropertyKeyValue(String path,String key) throws Throwable {
	FileInputStream ip = new FileInputStream(path);
	Properties prop = new Properties();
	prop.load(ip);
	String data = prop.getProperty(key);
	return data;	
	}
	public static String getDataFromExcel(String path,int row ,int cell,String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream ip=new FileInputStream(path);
		Workbook w=WorkbookFactory.create(ip);
		Sheet s=w.getSheet(sheet);
		String data=s.getRow(row).getCell(cell).toString();
		return data;	
	}
}
