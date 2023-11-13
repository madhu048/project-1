package Package_1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dammy 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		
		String a = "qedge technalogies";
		 char[] b = a.toCharArray();
		//System.out.println(b[0]);
		  int L = a.length();
		//for(int i=1;i<=L;i++)
		for(int i=b.length-1;i>=0;i--)
		{
			//char l = b[L-i];
			//System.out.print(l);
			System.out.print(b[i]);
		}
		
		int[] Array = {2,5,8,1,1,2};
		//int l = Array.length;
		//System.out.print(Array[0]);
		//for(int i =0;i<l;i++)
		for(int i=0;i<b.length;i++)
		{
			for(int j=i;j<b.length;j++)
			{
				if(b[i]> b[j])
				{
					char temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for(int num : b)
		{
			System.out.print(num);
		}
		//System.out.println(b);
		//System.out.print(a);
		//System.out.println(Array[0]=9);
		/*String data = "a2b3c4"; 
		data.replaceAll("\\D","");
		System.out.println(data.replaceAll("\\S",""));
      for(int c=0;c<data.length();c++)
		{
			char x = data.charAt(c);
			if(Character.isDigit(x))
			{
				int val = Character.getNumericValue(x);
				while(val>0)
				{
					System.out.print(data.charAt(c-1));
					val--;
				}
			}
			//System.out.print(x+""+x);
			
//			switch(x)
//			{
//			case'a':
//				
//				System.out.print(x+""+x);
//				break;
//			case'b':
//				System.out.print(x+""+x+""+x);
//				break;
//			case'c':
//				System.out.print(x+""+x+""+x+""+x);
//			}
		}*/
      
	
		
		

	}}


