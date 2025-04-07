package browserInitialisationPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public static void main(String[] args) {
		Base baseObj = new Base();
		baseObj.initializeBrowser();
		//baseObj.closeAndQuit();
	}
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}
	public void closeAndQuit() {
		driver.close();
		//driver.quit();
	}

}
