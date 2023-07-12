package day1Squad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("box6"));
		
		WebElement target=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		

	}

}
