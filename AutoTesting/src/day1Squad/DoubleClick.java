package day1Squad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Akil.Pathan\\\\Desktop\\\\Automation Eclips files\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions doublee=new Actions(driver);
		doublee.doubleClick(doubleClick).perform(); //Double Click action
		

	}

}
