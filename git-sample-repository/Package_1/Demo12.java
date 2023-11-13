package Package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws Throwable {

//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://facebook.com");
//		//Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("fddg");
//		driver.findElement(By.id("pass")).sendKeys("fddg");
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("yyfyu");
//		driver.close();
		String a = "abc asdf pqrs";
//		int count = 0;
//		for(int i=0;i<a.length();i++)
//		{
//			if(a.charAt(i)!=' ') {
//				count= count+1;
//			}
//			
//		}
//		System.out.println(count);
		
		String b=a.replaceAll("\\s","");
		for(int i=0;i<b.length();i++)
		{
			int h=0;
			for(int j=i;j<b.length();j++)
			{
				while(b.charAt(i)==b.charAt(j))
				{
					i++;
					break;
				}
			}
		}
		
		

	}

}
