package browserInitialisationPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{

	public static void main(String[] args) {
		TableHandling tableHandObj = new TableHandling();
		tableHandObj.initializeBrowser();
		tableHandObj.readFullTableData();
		System.out.println("*********************");
		tableHandObj.readSingleRowData();
		System.out.println("##############");
		tableHandObj.readDataFromSingleRow();
		System.out.println("#COLUMN DATA ############");
		tableHandObj.readColumnData();
		System.out.println("&&&&&&&Checking&&&&");
		tableHandObj.checkDataFromTable();

	}
	public void readFullTableData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableXpathLoc = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println("table-->" + tableXpathLoc.getText()); // to get the text contents
	}
	public void readSingleRowData() {
		
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowDataXpathLoc = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println("single row-->" + rowDataXpathLoc.getText());// to display in console
	}

	public void readDataFromSingleRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement readDataFromRowXpathLoc = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		System.out.println("data from single row-->" + readDataFromRowXpathLoc.getText());
	}
	public void readColumnData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> readDataFromCol = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for (WebElement colData : readDataFromCol) {
			System.out.println("Column Data---->" + colData.getText());
			
		}
	}
	
	public void checkDataFromTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String val = "Rhona Davidson";
		List<WebElement> checkColDataXpathLoc = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for (WebElement columnData : checkColDataXpathLoc) {
			
			if (columnData.getText().equals(val)) {
				System.out.println(columnData.getText());
			}
		}
		
	}

}
