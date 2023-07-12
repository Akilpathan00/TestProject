package testingPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactSearchReveal {

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
		
		WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
		loginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement search=driver.findElement(By.xpath("//*[@id=\"searchKeyword\"]"));
		search.sendKeys("barber");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement autosuggest_Click=driver.findElement(By.className("Link"));
		autosuggest_Click.click();
		
		List<WebElement> reveal=driver.findElements(By.className("reveal-icon-contact"));
		
		for(int i=0; i<reveal.size()-1;i++)
		{
			System.out.println(reveal.get(i).getText());
			
		}
		for(int i=0; i<reveal.size()-1;i++)
		{
			if(reveal.get(i).getText().contains("Reveal"))
			{
				Thread.sleep(3000);
				reveal.get(5).click();
			}
		}
		
		

	}

}
