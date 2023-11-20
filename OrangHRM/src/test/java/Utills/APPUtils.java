package Utills;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class APPUtils 
{
	public static WebDriver driver;
	@BeforeSuite
	public static void lanchApp()
	{
		System.setProperty("WebDriver.driver.edge","msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@BeforeTest
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123",Keys.ENTER);
		String currentUrl = driver.getCurrentUrl().toLowerCase();
		if(currentUrl.contains("dashboard"))
		{
			System.out.println("Login was successfull");
		}else {
			System.out.println("Login was not successfull");		}
	}
	@AfterTest
	public void logout()
	{
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		if(driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed()) {
			System.out.println("Logout was successfull");
		}else {
			System.out.println("Logout was not successfull");
		}
	}
	@AfterSuite
	public static void closeApp()
	{
		driver.quit();
	}

}
