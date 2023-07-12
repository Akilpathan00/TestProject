package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteXlsx {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		FileInputStream fin=new FileInputStream("C:\\Users\\Akil.Pathan\\Documents\\Excel\\xlsxmultilogin.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sh=wb.getSheet("Sheet1");
		for(int i=1; i<=sh.getLastRowNum();i++)
		{
			XSSFRow rw=sh.getRow(i);
			XSSFCell uname=rw.getCell(0);
			XSSFCell password=rw.getCell(1);
			
			//To create new cell
			XSSFCell res=rw.createCell(2);
			
			System.out.println("Username : " +uname+ "Password : " +password);
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).clear();
			driver.findElement(By.id("user-name")).sendKeys(uname.toString());
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(password.toString());
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();
			try
			{
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			res.setCellValue("Pass");
			System.out.println("Login successfull");
			}
			catch(Exception e)
			{
				res.setCellValue("Fail");
				System.out.println("User is block");
			}
		}
		
		fin.close();
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Akil.Pathan\\\\Documents\\\\Excel\\\\xlsxmultilogin.xlsx");
		wb.write(fos);
		fos.close();
		driver.quit();
		wb.close();



	}

}
