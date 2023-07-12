package testingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Akil.Pathan\\\\\\\\Desktop\\\\\\\\Automation Eclips files\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.smarteinc.com/index-page");
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("inputEmail"));
		username.sendKeys("akil.pathan@smarteinc.com");
		
		WebElement password=driver.findElement(By.id("inputPassword"));
		password.sendKeys("Smarte@123456");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement rightClick=driver.findElement(By.xpath("//*[@id=\"landing\"]/div/div/div[3]/div[1]/div/div/div[1]/button"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(rightClick).perform();

	}

}
