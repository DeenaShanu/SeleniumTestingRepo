package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownsCls extends Base{

	public static void main(String[] args) {
		HandlingDropDownsCls dropObj = new HandlingDropDownsCls();
		dropObj.initializeBrowser();
		dropObj.selectInputPage();

	}
	public void selectInputPage() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectBoxLoc = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(selectBoxLoc);
		//select.selectByIndex(3); based on index
		//select.selectByValue("Green");  //based on value
		select.selectByVisibleText("Yellow"); //based on visible text
	}
	

}
