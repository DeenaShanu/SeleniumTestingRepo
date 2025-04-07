package browserInitialisationPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsCls extends Base{

	public static void main(String[] args) {
		FindElementsCls elemntsObj = new FindElementsCls();
		elemntsObj.initializeBrowser();
		//elemntsObj.selectMultipleElemnts();
		elemntsObj.findMultipleElements();
	}
	
	public void selectMultipleElemnts() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> mulChkLoc = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for (WebElement elemnt : mulChkLoc) {
				elemnt.click();
		}
	}
	public void findMultipleElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> textFieldsLoc = driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement textElemnt : textFieldsLoc) {
			textElemnt.sendKeys("hi");
		}
	}

}
