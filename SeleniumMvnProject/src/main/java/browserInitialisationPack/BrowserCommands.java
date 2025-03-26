package browserInitialisationPack;

public class BrowserCommands extends Base{

	public static void main(String[] args) {
		BrowserCommands cmdsObj = new BrowserCommands();
		cmdsObj.initializeBrowser();
		cmdsObj.browserCommands();
		cmdsObj.closeAndQuit();

	}
	public void browserCommands() {
		String title = driver.getTitle();
		System.out.println("title = " + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url = " + currentUrl);
		String pageSource = driver.getPageSource();
		System.out.println("pageSource = " + pageSource);
	}

}
