package day1Squad;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Akil.Pathan\\\\Desktop\\\\Automation Eclips files\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement right=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(right).perform(); //Right click action

	}

}
