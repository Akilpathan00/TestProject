package day2DDR;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDDR {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		FileInputStream fin= new FileInputStream("C:\\Users\\Akil.Pathan\\Documents\\Excel\\MultiLogin.xls");
		HSSFWorkbook book=new HSSFWorkbook(fin);
		HSSFSheet sh=book.getSheet("Sheet1");
		
		int rowCount=sh.getLastRowNum();
		int cellCount=sh.getRow(1).getLastCellNum();
		
		for(int i=1; i<=rowCount; i++)
		{
			Thread.sleep(2000);
			HSSFRow row=sh.getRow(i);
			HSSFCell uname=row.getCell(0);
			HSSFCell pword=row.getCell(1);
			
			System.out.println("Username : " +uname+ "Password : " +pword);
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys(uname.toString());
			driver.findElement(By.id("password")).sendKeys(pword.toString());
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			try
			{
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			}
			catch(Exception e)
			{
				System.out.println("User is block");
			}
			
		}
		
		driver.quit();
		book.close();
		
	}

}
