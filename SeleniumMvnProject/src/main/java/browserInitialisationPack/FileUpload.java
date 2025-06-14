package browserInitialisationPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public WebDriver driver;
	
	public static void main(String[] args) throws AWTException {
		FileUpload fileUpLdObj = new FileUpload();
		//fileUpLdObj.fileUpload();
		fileUpLdObj.fileUpload2();

	}
	
	public void fileUpload() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement chooseFileLoc = driver.findElement(By.id("file-upload"));
		//file upload using send keys
		chooseFileLoc.sendKeys("C:\\Users\\shanu\\Pictures\\Screenshots\\Screenshot 2025-01-17 101251.png");
		WebElement upLoadBtnLoc = driver.findElement(By.xpath("//input[@value='Upload']"));
		upLoadBtnLoc.click();
	}
	//file upload using robot class
	public void fileUpload2() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectLoc = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		selectLoc.click();
		StringSelection selection = new StringSelection("C:\\Users\\shanu\\Desktop\\CORE_JAVA_NOTES_New_(Repaired)[1].pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);//copy to clipboard
		Robot robot = new Robot();
		robot.delay(1500);
		// for pasting file--
		robot.keyPress(KeyEvent.VK_CONTROL);//VK-virtual Keys
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);  //to upload
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
