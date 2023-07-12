package day2DDR;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDDR {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		FileInputStream fin= new FileInputStream("C:\\Users\\Akil.Pathan\\Documents\\Excel\\Login.xls");
		HSSFWorkbook book=new HSSFWorkbook(fin);
		HSSFSheet sh=book.getSheet("Sheet1");
		HSSFRow row=sh.getRow(1);
		HSSFCell uname=row.getCell(0);
		HSSFCell pword=row.getCell(1);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("user-name")).sendKeys(uname.toString());
		driver.findElement(By.id("password")).sendKeys(pword.toString());
		Thread.sleep(5000);
		driver.findElement(By.id("login-button")).click();


	}

}
