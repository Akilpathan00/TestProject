package day3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DemoScreenshot {

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=new File("C:\\Users\\Akil.Pathan\\Documents\\abc.jpeg");//By creating folder
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),src);
		
		//FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File("./Scrsht.png")); //In Eclipse section

	}

}
