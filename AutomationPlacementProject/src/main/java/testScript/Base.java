package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;

	public void browserInitialization() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}

	public void browserClose() {
		driver.close();
//		driver.quit();
	}

	public static void main(String[] args) {
		Base base = new Base();
		base.browserInitialization();
//		base.browserClose();

	}

}
