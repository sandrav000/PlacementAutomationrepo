package testScript1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testScript1.Base;

public class FormSubmit extends Base {
	@Test
	public void formSubmitHandling() {
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement f_name = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
		f_name.sendKeys("sandra");
		WebElement l_name = driver.findElement(By.xpath("//input[@id='validationCustom02']"));
		l_name.sendKeys("varghese");
		WebElement user_name = driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
		user_name.sendKeys("santreeza");
		WebElement city = driver.findElement(By.xpath("//input[@id='validationCustom03']"));
		city.sendKeys("Chaganacherry");
		WebElement state = driver.findElement(By.xpath("//input[@id='validationCustom04']"));
		state.sendKeys("Kerala");
		WebElement zip = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
		zip.sendKeys("686536");
		WebElement check = driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		if (check.isSelected()) {
			System.out.println("Checkbox already selected");
		} else {
			check.click();
			System.out.println("Checkbox selected now");
		}
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit form']"));
		submit.click();
	}

}
