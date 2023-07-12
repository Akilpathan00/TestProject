package sdetPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement countryEle=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		Select country=new Select(countryEle);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		//country.selectByVisibleText("Australia");
		
		//country.selectByValue("AIA");
		
		//country.selectByIndex(6);
		
		//select option from dropdown without using methods
		
		List<WebElement>alloptions= country.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Austria"))
			{
				option.click();
				break;
			}
		}

	}

}
