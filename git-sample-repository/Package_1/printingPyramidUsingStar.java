package Package_1;

public class printingPyramidUsingStar {

	public static void main(String[] args) 
	{
		// Forming pyramid using switch case
		String a = "madhu";
		for(int i=0;i<a.length();i++)
		{
			char s=a.charAt(i);
			switch(s)
			{
			case 'm':
				System.out.println("    "+s+"    ");
				break;
			case 'a':
				System.out.println("   "+s+s+s+"   ");
				break;
			case 'd':
				System.out.println("  "+s+s+s+s+s+"  ");
				break;
			case 'h':
				System.out.println(" "+s+s+s+s+s+s+s+" ");
				break;
			case 'u':
				System.out.println(s+""+s+""+s+""+s+""+s+""+s+""+s+""+s+""+s);
				break;
				default :
					System.out.println("no one is matched");
			}
		}
		
		// forming pyramid using for loops
		 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i*2-1;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
