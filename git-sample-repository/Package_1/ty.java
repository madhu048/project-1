package Package_1;

public class ty {

	public static void main(String[] args) 
	{
		/*int a =0;
		while(a<=41)
		{
			System.out.println(a);
			a=a+2;
		}*/
		
		// printing a string in reverse using for loop
		
		String a1 = "madson";
		char[] b = a1.toCharArray(); // converting string into array
		//char x = b[0];
		//System.out.println(x);
		/*int p = a1.length();
		for(int i= 0;p>=i;p--)
		{
			switch(p)
			{
				case 0:
					System.out.println(b[0]);
					break;
				case 1:
					System.out.println(b[1]);
					break;
				case 2:
					System.out.println(b[2]);
					break;
				case 3:
					System.out.println(b[3]);
					break;
				case 4:
					System.out.println(b[4]);
					break;
				case 5:
					System.out.println(b[5]);
					break;
					//default:
						//System.out.println("no one is matched");
					
			}
		}*/
		
		String a="testing";
		char x[] = a.toCharArray();
		int count=0;
		char res='a';
		for(int i=0;i<x.length;i++) 
		{
			
			
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
					count=count+1;
					res = x[i];
				}else
				{
					
				}
				
			}
		}
		System.out.println(res+" is repeated "+count+" times");

	}

}
