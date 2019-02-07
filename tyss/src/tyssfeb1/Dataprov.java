package tyssfeb1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Dataprov {
	@DataProvider
	public String[][] compareXLData() throws Exception {
		FileInputStream fis = new FileInputStream("./data/bluest.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String[][]arr;
		arr = new String[sheet.getPhysicalNumberOfRows()][sheet.getRow(0).getLastCellNum()];
		int r = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
			{
				Cell data = sheet.getRow(i).getCell(j);
				arr[i][j]=data.toString();
				//System.out.println(arr[i][j]);
				
				
			}
		}
		return arr;
	}
	@Test(dataProvider="compareXLData")
	public void validatePrice(String df,String srtd)
	{
		Assert.assertNotEquals(df, srtd);
	}

}
