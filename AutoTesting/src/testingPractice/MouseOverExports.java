package testingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverExports {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.smarteinc.com/weblogin");
		
		WebElement username = driver.findElement(By.id("inputEmail"));
		username.sendKeys("akil.pathan@smarteinc.com");
		
		WebElement password = driver.findElement(By.id("inputPassword"));
		password.sendKeys("Smarte@123456");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		WebElement exports=driver.findElement(By.xpath("//*[@id=\"navbarDropdown2\"]"));
		Actions act=new Actions(driver);
		Thread.sleep(20000);
		act.moveToElement(exports).click().perform();

	}

}
