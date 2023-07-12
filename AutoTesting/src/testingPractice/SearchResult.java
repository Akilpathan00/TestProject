package testingPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResult {

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
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			WebElement search =driver.findElement(By.xpath("//*[@id=\"searchKeyword\"]"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			search.sendKeys("Infosys");

			List<WebElement> search_suggestion = driver.findElements(By.xpath("//a[@class='Card Company']"));
			for(int i=0; i<search_suggestion.size()-1;i++)
			{
				System.out.println(search_suggestion.get(i).getText());
			}
			
			for(int i=0; i<search_suggestion.size()-1;i++)
			{
				if(search_suggestion.get(i).getText().contains("Infosys"))
				{
					search_suggestion.get(0).click();
				}
			}
	}

}
