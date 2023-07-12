package day1Squad;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Akil.Pathan\\\\Desktop\\\\Automation Eclips files\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
					
					driver.get("https://demo.opencart.com/");
					driver.manage().window().maximize();
					
					WebElement mouse=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
					
					WebElement macc=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
					
					Actions act=new Actions(driver);
					act.moveToElement(mouse).moveToElement(macc).click().perform();

	}

}
