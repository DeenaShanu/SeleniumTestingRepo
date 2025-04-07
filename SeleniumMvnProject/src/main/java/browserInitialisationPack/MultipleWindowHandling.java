package browserInitialisationPack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling{

	public WebDriver driver;
	public static void main(String[] args) {
		MultipleWindowHandling mulObj = new MultipleWindowHandling();
		mulObj.mulWindow();

	}
	public void mulWindow() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contactLinkLoc = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactLinkLoc.click();
		WebElement loginPortLoc = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortLoc.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("*****");
		System.out.println(childWindow);
		String title = "";
		for (String temp : childWindow) {
			if (!temp.equals(parent)) {
				System.out.println(temp);
				driver.switchTo().window(temp);
			//	System.out.println(driver.getTitle());
				title = driver.getTitle();
				
			}
			if (title.equals("WebDriver | Login Portal")) {
				WebElement username = driver.findElement(By.cssSelector("input[placeholder=Username]"));
				username.sendKeys("Admin");
				WebElement passwordLoc = driver.findElement(By.xpath("//input[@type='password']"));
				passwordLoc.sendKeys("test");
				WebElement btnLoc = driver.findElement(By.xpath("//button[@id='login-button']"));
				btnLoc.click();
				driver.switchTo().alert().accept();
			}
			if(title.equals("WebDriver | Contact Us")) {
				WebElement firstNameLoc = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstNameLoc.sendKeys("Lal");
				WebElement lastNameLoc = driver.findElement(By.xpath("//input[@name='last_name']"));
				lastNameLoc.sendKeys("Lijo");
			}
		}
		
	}

}
