import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld_google {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\ChromeDriver\\v80\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("helloworld");

    }
}

