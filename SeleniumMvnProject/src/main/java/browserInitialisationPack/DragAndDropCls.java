package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropCls extends Base{

	public static void main(String[] args) {
		DragAndDropCls dragClsObj = new DragAndDropCls();
		dragClsObj.initializeBrowser();
		dragClsObj.dragAndDrop();

	}
	
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragXpathLoc1 = driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement dropBoxIdLoc = driver.findElement(By.id("mydropzone"));
		
		Actions actions = new Actions(driver);
		//---for mouse hover and click
		actions.moveToElement(dragXpathLoc1).click();
		//------if double click------
		actions.doubleClick(dragXpathLoc1).perform();
		
		actions.dragAndDrop(dragXpathLoc1, dropBoxIdLoc).build().perform();
		
	}

}
