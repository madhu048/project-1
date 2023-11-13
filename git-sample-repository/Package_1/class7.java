package Package_1;

import java.util.Set;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class7
{
	//public static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
//		
		String a = "abba";
		String rev = "";
		for(int i=1;i<=a.length();i++)
		{
			 rev =rev+a.charAt(a.length()-i);
		}
		if(a.equals(rev))
		{
			System.out.println(a+" is palandrome string");
		}else
		{
			System.out.println(a+" is not palandrome string");
		}
	
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		noDriver();
//		driver.get("http://gmail.com");
//		//driver.findElement(By.name("q")).sendKeys("dxfghjk");
//		//Thread.sleep(2000);
//		//driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("yyfyu");
//		//driver.close();
//		
//		/*String s = "madhu";
//		char[] x = s.toCharArray();
//		int L = x.length;
//		for(int i=1;i<=L;i++)
//		{
//			
//			//System.out.println(l);
//			System.out.print(x[L-i]);
//		}*/
//		driver.findElement(By.linkText("Privacy")).click();
//		Set<String> neme = driver.getWindowHandles();
//	    Object[] x=neme.toArray();
//	    String a = (String)x[0];
//	    String b = (String)x[1];
//	    driver.switchTo().window(b).findElement(By.linkText("Information Google collects")).click();
//		
//	}
//	/*public void property()
//	{
//		System.out.println("madhu");
//	}
//	public  void marry()
//	{
//		String y = "sujith";
//		System.out.println(y);
//	}*/
//	
	
	}}



