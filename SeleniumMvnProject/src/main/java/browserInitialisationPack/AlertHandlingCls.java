package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandlingCls extends Base{

	public static void main(String[] args) {
		AlertHandlingCls alertClsObj =  new AlertHandlingCls();
		alertClsObj.initializeBrowser();
		//alertClsObj.alertHandling();
		//alertClsObj.secClickAlert();
		alertClsObj.promptClk();
		

	}
	public void alertHandling() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement buttonLoc = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		buttonLoc.click();
		driver.switchTo().alert().accept();
	}
	
	public void secClickAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement secBtnLoc = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		secBtnLoc.click();
		driver.switchTo().alert().dismiss();
	}
	//btn btn-danger
	public void promptClk() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptBtnClk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBtnClk.click();
		driver.switchTo().alert().sendKeys("Clicked");
		driver.switchTo().alert().accept();
		
	}

}
