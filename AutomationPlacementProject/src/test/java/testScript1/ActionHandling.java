package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionHandling extends Base {
	@Test
	public void dragAndDropMethod() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement source = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, dest).perform();
	}

	@Test
	public void rightClickMethod() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement click = driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions actions = new Actions(driver);
		actions.contextClick().perform();

	}

}
