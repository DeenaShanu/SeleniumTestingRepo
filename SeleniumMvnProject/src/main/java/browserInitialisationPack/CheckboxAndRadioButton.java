package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadioButton extends Base{

	// https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html----for testing
	public static void main(String[] args) {
		CheckboxAndRadioButton chkRadioObj = new CheckboxAndRadioButton();
		chkRadioObj.initializeBrowser();
		//chkRadioObj.checkDemo();
		chkRadioObj.radioBtn();
		

	}
	public void checkDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement chkBoxLoc = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		//isSelected (if already selected chkbox)
		chkBoxLoc.click();
	}
	public void radioBtn() {
	
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radBtnLoc = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radBtnLoc.click();
		WebElement btnLoc1 = driver.findElement(By.id("button-one"));
		btnLoc1.click();
		
	}

}
