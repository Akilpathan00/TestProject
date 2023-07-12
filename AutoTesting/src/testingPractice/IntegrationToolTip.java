package testingPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntegrationToolTip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akil.Pathan\\Desktop\\Automation Eclips files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qc3-app.smarteinc.com/weblogin");
		
		WebElement username = driver.findElement(By.id("inputEmail"));
		username.sendKeys("akil.pathan@smarteinc.com");
		
		WebElement password = driver.findElement(By.id("inputPassword"));
		//password.isDisplayed();
		//password.isEnabled();
		password.sendKeys("Smarte@123456");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		 
		 WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div/form/button"));
			//loginButton.isDisplayed();
			//loginButton.isEnabled();
			loginButton.click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			WebElement search =driver.findElement(By.xpath("//*[@id=\"searchKeyword\"]"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			search.sendKeys("Infosys");

			List<WebElement> search_suggestion = driver.findElements(By.xpath("//a[@class='Card Company']"));
			for(int i=0; i<search_suggestion.size()-1;i++)
			{
				System.out.println(search_suggestion.get(i).getText());
			}
			
			for(int i=0; i<search_suggestion.size()-1;i++)
			{
				if(search_suggestion.get(i).getText().contains("Infosys"))
				{
					search_suggestion.get(0).click();
				}
			}
			
			Set<String> profilePageWindow=driver.getWindowHandles(); //return multiple windows
			
			//Using Iterator method
			
			/*Iterator<String> it=profilePageWindow.iterator();
			
			String loginpageID=it.next();
			String profilepageID=it.next();
			
			System.out.println(loginpageID);
			System.out.println(profilepageID);*/
			
			for(String winid :profilePageWindow)
			{
				String title=driver.switchTo().window(winid).getTitle();
				System.out.println(title);
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			driver.findElement(By.xpath("(//div[@class='dropdown export-to'])[1]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
			
			
			List<WebElement> exportToolTip = driver.findElements(By.xpath("//ul[@class='dropdown-menu show']//li"));
			System.out.println("Number of CRM's : " +exportToolTip.size());
			
			for(WebElement tooltip:exportToolTip)
			{
				if(tooltip.getText().equals("Salesforce"))
				{
					tooltip.click();
					break;
				}
			}
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"exportToModal\"]/div/div/div[3]/div/button[2]"));
			Set<String> multiPop=driver.getWindowHandles(); //return multiple windows
			
			
			for(String popup :multiPop)
			{
				String title=driver.switchTo().window(popup).getTitle();
				System.out.println(title);
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
			
			driver.findElement(By.xpath("//*[@id=\"exportToModal\"]/div/div/div[3]/div/button[2]")).click();
			
			try
			{
				driver.findElement(By.id("duplicate-select-all")).click();
				
				driver.findElement(By.xpath("//*[@id=\"exportToModal\"]/div/div/div[3]/div/button[2]")).click();
				
			}
			catch(Exception e)
			{
				Set<String> duplicate=driver.getWindowHandles();
				for(String dup:duplicate)
				{
					String title=driver.switchTo().window(dup).getTitle();
					System.out.println(title);
				}
				driver.findElement(By.xpath("//*[@id=\"exportToModal\"]/div/div/div[3]/button")).click();
			}
			//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.nsg-button"))).click();

	}

}
