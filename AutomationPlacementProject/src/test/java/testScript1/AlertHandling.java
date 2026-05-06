package testScript1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends Base {
	@Test
	public void simpleAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click_me = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		click_me.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click_me = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		click_me.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	@Test
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement click_me = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		click_me.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("sandra");
		alert.accept();

	}
}
