package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEg {

	public WebDriver driver;
	
	public static void main(String[] args) {
		JavaScriptExecutorEg javaScrptObj = new JavaScriptExecutorEg();
		javaScrptObj.javaScriptionExec();
		

	}
	public void javaScriptionExec() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", ""); // scroll down
		js.executeScript("window.scrollBy(0,-500)", ""); // scroll up
		WebElement checkBoxDemo=driver.findElement(By.xpath("//div[@class='nav-search-field ']"));

		js.executeScript("arguments[0].click();",checkBoxDemo);
		checkBoxDemo.click();
	}

}
