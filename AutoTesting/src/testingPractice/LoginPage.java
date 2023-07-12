package testingPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.smarteinc.com/weblogin");
		
		WebElement username = driver.findElement(By.id("inputEmail"));
		username.sendKeys("akil.pathan@smarteinc.com");
		
		WebElement password = driver.findElement(By.id("inputPassword"));
		//password.isDisplayed();
		//password.isEnabled();
		password.sendKeys("Smarte@123456");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
		//loginButton.isDisplayed();
		//loginButton.isEnabled();
		loginButton.click();
		
		if(driver.getCurrentUrl().equals("https://app.smarteinc.com/index-page"))
		{
			System.out.println("Login successfully done and it is redirected to the smarte page");
		}
		else
		{
			System.out.println("Wrong credentials entered");
		}
		
		WebElement filterButton = driver.findElement(By.className("IndexSearchBtn") );
		filterButton.click();

	}

}
