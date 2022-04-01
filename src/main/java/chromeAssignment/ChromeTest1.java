package chromeAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("https://timesofindia.indiatimes.com/poll.cms");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement input = driver.findElement(By.xpath("//div[@pg='Vote']"));
	input.click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(10000);
	driver.close();
	}
}
