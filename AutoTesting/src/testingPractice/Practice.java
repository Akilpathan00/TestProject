package testingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.smarteinc.com/weblogin");
		driver.manage().window().maximize();*/
		
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.smarteinc.com/weblogin");
		/*driver.manage().window().maximize();
		driver.findElement(By.id("inputEmail")).sendKeys("akil.pathan@smarteinc.com");
		driver.findElement(By.id("password")).sendKeys("Smarte@123456");
		driver.findElement(By.className("Sign In")).click();*/

	}

}
