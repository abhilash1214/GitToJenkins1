package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
	
	
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abilash PL\\Desktop\\SeleniumProjects\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.javatpoint.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 5000)");
		driver.findElement(By.linkText("Core Java")).click();

	}

}
