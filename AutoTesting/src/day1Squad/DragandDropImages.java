package day1Squad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropImages {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		
		WebElement image1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement image2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(image2, target).perform();
		act.dragAndDrop(image1, target).perform();

	}

}
