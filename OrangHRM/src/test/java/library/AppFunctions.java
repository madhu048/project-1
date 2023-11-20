package library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utills.APPUtils;

public class AppFunctions extends APPUtils
{
	public void providingLoginDetails(String employeeName,String UserName,String password) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='option'][3]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='option'][2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(employeeName);
		Thread.sleep(3000);
		WebElement listbox=driver.findElement(By.xpath("//div[@role='listbox']")); 
		Thread.sleep(2000);
		List<WebElement> list = listbox.findElements(By.xpath("//div[@role='listbox']//div[@role]"));
		for(WebElement a:list)
		{
			if(a.getText().toLowerCase().contains(employeeName))
			{
				a.click();
				System.out.println("EmployeeName waw displayed in list and selected");
				break;
			}
		}
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@autocomplete]")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@type]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'and@type]")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	public void addNewEmployee(String fname,String mname,String lname) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(mname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		String empId = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
	
}
