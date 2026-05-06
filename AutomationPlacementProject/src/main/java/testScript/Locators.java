package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void id() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement elmt = driver.findElement(By.id("single-input-field"));
		WebElement show = driver.findElement(By.id("button-one"));
		WebElement value1 = driver.findElement(By.id("value-a"));
		WebElement value2 = driver.findElement(By.id("value-b"));
		WebElement get_total = driver.findElement(By.id("button-two"));
	}

	public void name() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement tex = driver.findElement(By.name("daterange"));
		WebElement viewport = driver.findElement(By.name("viewport"));
		WebElement desc = driver.findElement(By.name("description"));
		WebElement key = driver.findElement(By.name("keywords"));
		WebElement auth = driver.findElement(By.name("author"));
	}

	public void className() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enter_date = driver.findElement(By.className("form-control datepicker"));
		WebElement form_datepicker = driver.findElement(By.className("form-control"));
		WebElement head = driver.findElement(By.className("header-top"));
		WebElement section = driver.findElement(By.className("mb-sec"));
		WebElement footer = driver.findElement(By.className("mt-5"));

	}

	public void linkText() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement link1_text = driver.findElement(By.linkText("Ajax Form Submit"));
		WebElement link2_text = driver.findElement(By.linkText("Jquery Select2"));
		WebElement link3_text = driver.findElement(By.linkText("Select Input"));
		WebElement link4_text = driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement link5_text = driver.findElement(By.linkText("Checkbox Demo"));

	}

	public void partialLinkText() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement link1_partialtext = driver.findElement(By.partialLinkText("Ajax F"));
		WebElement link2_partialtext = driver.findElement(By.partialLinkText("Jquery S"));
		WebElement link3_partialtext = driver.findElement(By.partialLinkText("Select I"));
		WebElement link4_partialtext = driver.findElement(By.partialLinkText("Radio But"));
		WebElement link5_partialtext = driver.findElement(By.partialLinkText("Checkbox D"));

	}

	public void tagandId() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement tagid1 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement tagid2 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tagid3 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement tagid4 = driver.findElement(By.cssSelector("input#value-b"));
		WebElement tagid5 = driver.findElement(By.cssSelector("button#button-two"));

	}

	public void tagandClass() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		// WebElement
		// tagclass1=driver.findElement(By.cssSelector("input.form-control"));
		WebElement tagclass2 = driver.findElement(By.cssSelector("div.dataTables_wrapper"));
		WebElement tagclass3 = driver.findElement(By.cssSelector("div.header-top"));
		WebElement tagclass4 = driver.findElement(By.cssSelector("div.mb-sec"));
		WebElement tagclass5 = driver.findElement(By.cssSelector("footer.mt-5"));

	}

	public void tagandAttribute() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement tagid1 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement tagid2 = driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement tagid3 = driver.findElement(By.cssSelector("input[id='value-a']"));
		WebElement tagid4 = driver.findElement(By.cssSelector("input[id='value-b']"));
		WebElement tagclass = driver.findElement(By.cssSelector("div[class='header-top']"));
		WebElement tagclass1 = driver.findElement(By.cssSelector("div[class='mb-sec']"));

	}

	public void tagclassandAttribute() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement tagclassid1 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement tagclassid2 = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement tagclassid3 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		WebElement tagclassclass = driver.findElement(By.cssSelector("div.header-top[class='header-top']"));
		WebElement tagclassclass1 = driver.findElement(By.cssSelector("div.mb-sec[class='mb-sec']"));

	}

	public void relativeXpath() {
		// tag[@attribute='value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement element2 = driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement element3 = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement element4 = driver.findElement(By.xpath("//button[@id='button-two']"));
	}

	public void text() {
		// tag[text()='text']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Get Total']"));
		WebElement element3 = driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		WebElement element4 = driver.findElement(By.xpath("//button[text()='Submit data']"));

	}

	public void contains() {
		// tag[contains(@attribute,'value')]
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement element2 = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		WebElement element3 = driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		WebElement element4 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));

	}

	public void startsWith() {
		// tag[starts-with(@attribute,'value')]
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-in')]"));
		WebElement element2 = driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]"));
		WebElement element3 = driver.findElement(By.xpath("//button[starts-with(@id,'download')]"));
		WebElement element4 = driver.findElement(By.xpath("//span[starts-with(@id,'select2-878r')]"));

	}

	public void and() {
		// tag[@attribute='value' and @attribute='value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver.findElement(By.xpath("//input[@id='value-a' and @class='form-control']"));
		WebElement element2 = driver
				.findElement(By.xpath("//input[@id='single-input-field' and @placeholder='Message']"));
		WebElement element3 = driver
				.findElement(By.xpath("//input[@class='form-control datepicker' and @id='single-input-field']"));
		WebElement element4 = driver.findElement(By.xpath("//input[@id='single-input-field2' and @name='daterange']"));

	}

	public void or() {
		// tag[@attribute='value' or @attribute='value']
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement element1 = driver
				.findElement(By.xpath("//input[@id='single-input-field' or @fdprocessedid='xzz0i']"));
		WebElement element2 = driver.findElement(By.xpath("//input[@fdprocessedid='xzz0i' or @placeholder='Message']"));

	}

	public static void main(String[] args) {
		Locators locators = new Locators();
		locators.browserInitialization();
		locators.id();

	}

}
