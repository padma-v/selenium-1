package ch02.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator01_ID {

	public static void main(String[] args) throws InterruptedException {
		
		// Initiating Chrome Driver
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.sainsburys.co.uk/");

		// wait 5 seconds for the element to become visible
		Thread.sleep(5000);

		// Locate text box and Type
		WebElement searchbox = driver.findElement(By.id("term"));
		Thread.sleep(5000);

		searchbox.sendKeys("Vegetables");
		Thread.sleep(5000);

		Thread.sleep(5000);
		driver.quit();

	}

}
