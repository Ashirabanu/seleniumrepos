package homeassign.week6;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationWithExcel {

	public static String[][] xldata(String filename) throws IOException {
		 XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");
	        XSSFSheet sheet=wb.getSheetAt(0);
	        
	        XSSFRow row=sheet.getRow(0);
	       
	        int rowCount= sheet.getLastRowNum();
	        System.out.println("no of rows :"+rowCount);
	       
	        int cellCount = row.getLastCellNum();
	        System.out.println("no of cells :"+cellCount);
	        
	        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	        System.out.println("with header row :"+physicalNumberOfRows);
	       
	        String value = sheet.getRow(1).getCell(1).getStringCellValue();
	        System.out.println(value);
	        String[][] data=new String[rowCount][cellCount];
	        for (int i = 1; i <=rowCount; i++) {
	            XSSFRow row2 = sheet.getRow(i);
	            for (int j = 0; j <cellCount; j++) {
	                String data1 = row2.getCell(j).getStringCellValue();
	                System.out.println(data1);
	                data[i-1][j]=data1;
	                
	            }
	        }
	       
	        wb.close();
	        return data;

		

		}
	}


