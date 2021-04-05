package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class4 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethodTesting() {
		System.out.println("Before Method");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abilash PL\\Desktop\\SeleniumProjects\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void testing1() {
		System.out.println("In Test");

		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");
		driver.findElement(By.linkText("Core Java")).click();
	}
}