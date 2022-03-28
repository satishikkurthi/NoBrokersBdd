package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	 List list1;


	public void connection() throws IOException {
		file = new FileInputStream("D:\\workbooksforjavas\\nobroker.xlsx");
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet("sheet1");
	}
	
	
	public void getlogindata() throws IOException 
	{
		

       list1 = new ArrayList();
		connection();
		Iterator<Row> rows = sheet.iterator();
		Row row = rows.next();
		Iterator<Cell> cells = row.iterator();
		int index = 0;
		while (cells.hasNext())
		{
			Cell cell = cells.next();
			if (cell.getStringCellValue().equals("TestData"))
			{

				index = cell.getColumnIndex();
			}
		}
	    int i=0;
		while(rows.hasNext())
		{
			row = rows.next();
			Cell cell = row.getCell(index);
			
			if(row.getCell(index)!=null&&!cell.getStringCellValue().equals("https://www.nobroker.in/"))
			{
				//object[i]=cell.getStringCellValue();
				list1.add(cell.getStringCellValue());
				//System.out.println(cell.getStringCellValue()+cell.getStringCellValue().getClass().getSimpleName());
				
		
				i++;
				
			}
		 }
		//System.out.print(list1.size());
		

//		for(int k=0;k<list1.size();k++)
//		{
//			System.out.println(list1.get(k)+" "+k);
//		}	
     }
	
	public String getcorrectphonenumber()
	{
		String phonenumber = (String) list1.get(1);
		return phonenumber;
	}
	public String getcorrectpassword()
	{
		String password = (String) list1.get(3);
		return password;
	}
	public String getincorrectpassword()
	{
		String password = (String) list1.get(10);
		return password;
	}
	public String gethydloaction()
	{
	   String hydlocation=(String)list1.get(17) ;
	   return hydlocation;
	}
	public String getbangloaction()
	{
	   String banglocation=(String)list1.get(22) ;
	   return banglocation;
	}
	public String getchennailocation1()
	{
		return (String)list1.get(26);
	}
	public String getchennailocation2()
	{
		return (String)list1.get(27);
	}

}
