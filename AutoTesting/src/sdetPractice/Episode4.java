package sdetPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//isDisplayed() and isEnable();
		
		WebElement search=driver.findElement(By.id("small-searchterms"));
		System.out.println("Webelement is displayed : " +search.isDisplayed());
		System.out.println("Webelement is enabled : " +search.isEnabled());
		
		//isSelected()
		WebElement register=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		register.click();
		
		WebElement male=driver.findElement(By.id("gender-male"));
		WebElement female=driver.findElement(By.id("gender-female"));
		
		System.out.println("Male is selected : "+male.isSelected());
		System.out.println("Female is selected : " +female.isSelected());
		
		//after selecting male
		male.click();
		System.out.println("Male is selected : "+male.isSelected());
		System.out.println("Female is selected : " +female.isSelected());
		
		female.click();
		System.out.println("Male is selected : "+male.isSelected());
		System.out.println("Female is selected : " +female.isSelected());

	}

}
