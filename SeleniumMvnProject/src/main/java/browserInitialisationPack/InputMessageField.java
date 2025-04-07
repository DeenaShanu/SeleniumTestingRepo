package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMessageField extends Base{

	public static void main(String[] args) {
		InputMessageField msgObj = new InputMessageField();
		msgObj.initializeBrowser();
		msgObj.enterMessageField();
		//msgObj.closeAndQuit();

	}
	public void enterMessageField() {
	
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgFieldIdLoc = driver.findElement(By.id("single-input-field"));
		System.out.println(msgFieldIdLoc.isEnabled()); //to check whether the field(webElement) is enabled
		msgFieldIdLoc.sendKeys("Hello");
		WebElement buttonIdLoc = driver.findElement(By.id("button-one"));
		buttonIdLoc.click();
		WebElement enterField1cssLoc = driver.findElement(By.cssSelector("input#value-a"));
		enterField1cssLoc.sendKeys("1");
		WebElement enterField2cssLoc = driver.findElement(By.cssSelector("input[id=value-b]"));
		enterField2cssLoc.sendKeys("5");
		WebElement button2IdLoc = driver.findElement(By.id("button-two"));
		button2IdLoc.click();
	}

}
