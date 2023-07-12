package day2Squad;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipledropdown {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
		WebElement day=driver.findElement(By.name("DateOfBirthDay"));
		selectoptionfromdropdown(day, "14");
		
		WebElement month=driver.findElement(By.name("DateOfBirthMonth"));
		selectoptionfromdropdown(month, "August");
		
		WebElement year=driver.findElement(By.name("DateOfBirthYear"));
		selectoptionfromdropdown(year, "1995");
		

	}
	
	public static void selectoptionfromdropdown(WebElement ele, String value)
	{
		Select drp=new Select(ele);
		
		List<WebElement>alloptions=drp.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals(value))
			{
				option.click();
				break;
			}
		}
	}
}
