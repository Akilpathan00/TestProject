package sdetPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Episode3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Capture the Title of the page : " +driver.getTitle());
		
		System.out.println("Capture the URL of the page : " +driver.getCurrentUrl());
		
		System.out.println("Capture the PageSource of the page : " +driver.getPageSource());

	}

}
