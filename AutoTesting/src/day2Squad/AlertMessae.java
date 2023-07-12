package day2Squad;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessae {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		WebElement alr=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button"));
		alr.click();
		
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement alr1=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[2]/div/div/div/center/button"));
		alr1.click();
		Thread.sleep(3000);
		alt.dismiss();
		
		WebElement alr2=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[3]/div/div/div/center/button"));
		alr2.click();
		Thread.sleep(3000);
		alt.sendKeys("Yes");
		alt.accept();
		
	}

}
