package day1Squad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://blazedemo.com/");
		Select s=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		//s.selectByIndex(3);
		s.selectByValue("San Diego");
		
		Select s1=new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		s1.selectByValue("Berlin");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

	}

}
