package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public static void main(String[] args) {
		
		
	}
	
	public void idLocator() {
		WebElement messageFieldIdLoc = driver.findElement(By.id("single-input-field"));
		WebElement buttonFieldIdLoc = driver.findElement(By.id("button-one"));	
		WebElement alertModalLinkIdLoc = driver.findElement(By.id("alert-modal"));
	}
	public void classLocator() {
		WebElement headerFieldClassLoc = driver.findElement(By.className("header-top"));
		WebElement navBarClassLoc = driver.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		
	}
	public void nameLocator() {
		WebElement nameLoc = driver.findElement(By.name("description"));
		WebElement nameLoc1 = driver.findElement(By.name("authors"));
	}
	
	public void linkTextLocator() {
		WebElement linkLoc1 = driver.findElement(By.linkText("radio-button-demo.php"));
		WebElement linkLoc2 = driver.findElement(By.linkText("select-input.php"));
		WebElement linkLoc3 = driver.findElement(By.linkText("date-picker.php"));
	}
	
	public void partialLinkLocator() {
		WebElement partialLinkLoc1 = driver.findElement(By.partialLinkText("radio-"));
		WebElement partialLinkLoc2 = driver.findElement(By.partialLinkText("select-"));
		WebElement partialLinkLoc3 = driver.findElement(By.partialLinkText("date-"));
		
	}
	    //tag#id
		//tag.class
		//tag[attributetype=attributevalue]
		//tag.class[attributetype=attributevalue]
	public void cssSelectorEg() {
		WebElement cssSelectorLoc1 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement cssSelectorLoc2 = driver.findElement(By.cssSelector("input.form-control"));
		WebElement cssSelectorLoc3 = driver.findElement(By.cssSelector("input[placeholder=Message]"));
		WebElement cssSelectorLoc4 = driver.findElement(By.cssSelector("input.form-control[type=text]"));
		
		WebElement cssSelectorLoc5 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement cssSelectorLoc6 = driver.findElement(By.cssSelector("button.btn-primary"));
		WebElement cssSelectorLoc7 = driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement cssSelectorLoc8 = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	}
	
	//absolute xpath
	public void xPathLocator() {
		WebElement absoluteXPathLoc = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[2]/input"));
		WebElement absoluteXPathLoc2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
		
		//relative xpath
		//syntax --> //tagname[@attributetype='attributevalue']
		//input[@id='single-input-field']
	
		WebElement xPathRelativeLoc = driver.findElement(By.xpath("//input[@id='single-input-field']")); 
		WebElement xPathRelaLinkLoc1 = driver.findElement(By.xpath("//a[@href='bootstrap-dual-list.php']"));
		WebElement xPathRelaDivLoc2 = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']"));
		
	}
	
	// contains method in dynamic xpath
	//syntax-->//tagname[contains(@attributetype,'value')] --attribute value if dynamically changed
	
	public void dynamicXpathContain() {
		WebElement dynXpathContainLoc = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement dynXpathContainLoc1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-')]"));
		WebElement dynXpathContainLinkLoc1 = driver.findElement(By.xpath("//a[contains(@href,'jquery-select.php')]"));

	}
	//text method in dynamic xpath
	//syntax-->//tagname[text()='value']
	public void dynamicXpathText() {
		WebElement dynXpathTextLoc = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement dynXpathRadioTextLoc = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		
	}

}
