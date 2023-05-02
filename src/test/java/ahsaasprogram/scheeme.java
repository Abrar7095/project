package ahsaasprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@Test
public class scheeme {
	
		
		WebDriver driver;
	    
	    @BeforeTest
		public void LaunchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "D:\\chromedriver_win32/chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");     
	       options.addArguments("--disable-web-security");          
	       driver = new ChromeDriver(options);	
		           // maximizing the window
	         driver.manage().window().maximize();
	         driver.get("https://demowebshop.tricentis.com/");
	              Thread.sleep(4000);
		}
	
	@Test
	public void mouseactions() throws InterruptedException {
	
	Actions action=new Actions(driver);
	WebElement actions = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"));
	action.moveToElement(actions).perform();
	Thread.sleep(7000);
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500);");	
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[6]/div/div[1]/a/img")).click();
	Thread.sleep(4000);
	System.out.println("driver.getcurrentUrl()");
	
	}	
	@AfterTest	
	public void terminatebrowser() {
	 driver.quit();
	
		
		
		
	
	
	
	}	
	
}
 