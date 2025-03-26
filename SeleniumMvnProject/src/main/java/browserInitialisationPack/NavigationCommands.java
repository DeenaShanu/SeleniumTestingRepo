package browserInitialisationPack;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		NavigationCommands navcmdObj = new NavigationCommands();
		navcmdObj.initializeBrowser();
		navcmdObj.navigationCommands();
		//navcmdObj.closeAndQuit();

	}
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
