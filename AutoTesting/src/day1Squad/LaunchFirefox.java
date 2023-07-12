package day1Squad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Akil.Pathan\\\\Desktop\\\\Automation Eclips files\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); //upcasting
		driver.manage().window().maximize();
		driver.get("https://www.google.c");

	}

}
