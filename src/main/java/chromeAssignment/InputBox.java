package chromeAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement input = driver.findElement(By.xpath("//input[@name='email']"));
	    input.sendKeys("Sam@gmail.com");
	    
	    WebElement input2 = driver.findElement(By.xpath("//input[@name='pass']"));
	    input2.sendKeys("12345");
	    /*WebDriverWait wait = new WebDriverWait(driver, 10);*/ 
	    WebElement input3 = driver.findElement(By.xpath("//button[@name='login']"));
	    input3.click();
	    Thread.sleep(10000);
		driver.close();
	}

}
