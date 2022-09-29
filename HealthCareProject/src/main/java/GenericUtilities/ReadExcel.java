package GenericUtilities;


	import java.io.File;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.testng.annotations.DataProvider;

	public class ReadExcel implements IAutoConstant{
		@DataProvider(name = "testdata")
		public Object[][] readMultipleData() throws EncryptedDocumentException, InvalidFormatException, IOException {
			File path=new File(EXCELPATH1);
			Workbook workbook = WorkbookFactory.create(path);
			Sheet sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data =new Object [rowCount][cellCount];
			for(int row=0;row<rowCount;row++) {
				Row actRow = sheet.getRow(row);
				for(int cell=0;cell<actRow.getLastCellNum();cell++) {
					data[row][cell]=sheet.getRow(row).getCell(cell).toString();
				}
			}
			return data;
		}
	}


