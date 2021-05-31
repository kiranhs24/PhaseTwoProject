package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	
	public static HashMap<String, String> readExcel() throws IOException {
		
		FileInputStream fs = new FileInputStream(new File(System.getProperty("user.dir") + "/test_data/test_data.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		HashMap<String, String> user_data = new HashMap<String, String>();
		
		user_data.put("recipe_rating_" + 1, sheet.getRow(1).getCell(0).getStringCellValue());
		user_data.put("site_url", sheet.getRow(1).getCell(1).getStringCellValue());
		user_data.put("recipe_rating_" + 2, sheet.getRow(2).getCell(0).getStringCellValue());
		user_data.put("recipe_rating_" + 3, sheet.getRow(3).getCell(0).getStringCellValue());
		user_data.put("recipe_rating_" + 4, sheet.getRow(4).getCell(0).getStringCellValue());
		
		return user_data;
		
	}

}

