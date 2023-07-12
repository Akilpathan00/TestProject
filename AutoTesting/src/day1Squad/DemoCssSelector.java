package day1Squad;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoCssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Tagname and ID : tagname#inputID
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//Tagname and attribute : tagname[attribute=valueofAttribute] : Below not used
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		//Tagname and classname : tagname.valueofclassname : below not used
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration(10)); //Explicite wait
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	private static Duration Duration(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
