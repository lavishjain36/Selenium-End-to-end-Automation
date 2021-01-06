import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven {

	// identify Testcases coloumn by scanning the entire 1st row
	// once coloumn is identified then scan entire testcases coloumn to identify
	// purchase test case row
	// once we get the data of purchase testcase row =pull all the data
	// of that row & feed into test

	public ArrayList<String> getData(String testcasesName) throws IOException {
		ArrayList<String> a = new ArrayList<String>();

		// to get into fileinput stream , we have to goto excel file
		FileInputStream fis = new FileInputStream("C://work//Demodata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// identify Testcases coloumn by scanning the entire 1st row

				// iterate through each row in that sheet
				// get access to specific row
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();// sheet is a collection of rows
				Iterator<Cell> ce = firstrow.cellIterator();// row is a collection of cells

				int k = 0;
				int coloumn = 0;
				while (ce.hasNext())// check data is there or not
				{
					Cell value = ce.next();// move to next column
					if (value.getStringCellValue().equalsIgnoreCase(testcasesName)) {
						// desired column
						coloumn = k;

					}
					k++;
				}
				System.out.println(coloumn);

				// once coloumn is identified then scan entire testcases coloumn to identify
				// purchase test case row
				while (rows.hasNext()) {

					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcasesName)) {

						// once we get the data of purchase testcase row =pull all the data
						// of that row & feed into test

						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {

							Cell c = cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) {
								a.add(c.getStringCellValue());
							} else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}

		}

		return a;

	}

	public static void main(String[] args) {

	}
}
