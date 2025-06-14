package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public WebDriver driver;
	public static void main(String[] args) {
		FrameHandling frameObj = new FrameHandling();
		frameObj.frames();
	}
	public void frames() {
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement youTubeLoc  =  driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/RbSlW8jZFe8']"));
		driver.switchTo().frame(youTubeLoc);
		WebElement youTubeLoc1 = driver.findElement(
				By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
		youTubeLoc1.click();
//		WebElement frameJmeterLoc = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
//		driver.switchTo().frame(frameJmeterLoc);
//		WebElement JmeterImgLoc = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));		
//		JmeterImgLoc.click();
	}

}
