package day2Squad;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.LittleEndianDataInputStream;

public class DemoMultiList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys("admin123");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement menu1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		menu1.click();
		
		Actions act=new Actions(driver);
		
		List<WebElement> menu=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul"));
		
		System.out.println("Size of the Menu : " +menu.size());
		
		for(int i=0; i<menu.size()-1; i++)
		{
			act.moveToElement(menu.get(i));
			Thread.sleep(5000);
			act.perform();
			System.out.println(menu.get(i).getText());
		}
		
		for(int i=0; i<menu.size()-1; i++)
		{
			if(menu.get(i).getText().contains("Support"))
			{
				Thread.sleep(3000);
				menu.get(5).click();
			}
		}

	}

}
