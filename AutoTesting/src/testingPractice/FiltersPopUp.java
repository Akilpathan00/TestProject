package testingPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiltersPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.smarteinc.com/weblogin");
		WebElement username=driver.findElement(By.id("inputEmail"));
		username.sendKeys("akil.pathan@smarteinc.com");
		
		WebElement password=driver.findElement(By.id("inputPassword"));
		password.sendKeys("Smarte@123456");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement filterPopUp=driver.findElement(By.xpath("//*[@id=\"landing\"]/div/div/div[3]/div[1]/div/div/div[1]/button"));
		filterPopUp.click();
		
		Thread.sleep(3000);
		
		WebElement empdrop=driver.findElement(By.xpath("//*[@id=\"company-filter-page\"]/div[3]/div[1]/div[2]/div/div[1]/input"));
		empdrop.click();
		
		Thread.sleep(3000);
		
		WebElement empSize=driver.findElement(By.id("suggestedAdd"));
		
	
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement industryTl=driver.findElement(By.className("Industry_Header"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		industryTl.sendKeys("test");*/

	}

}
