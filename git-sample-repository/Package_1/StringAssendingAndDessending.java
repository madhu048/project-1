package Package_1;

public class StringAssendingAndDessending {

	public static void main(String[] args) 
	{
		String name = "Qedge Technologies";
		
		char[] a = name.toLowerCase().toCharArray();
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					    char temp = a[i];
					        a[i] = a[j];
					        a[j]=temp;
				}
			}
		}
		for(char g:a)
		{
			System.out.print(g);
		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[j]>a[i])
//				{
//					char temp = a[i];
//					     a[i] = a[j];
//					     a[j] = temp;
//				}
//			}
//		}
//		
//		for(char g : a)
//		{
//			System.out.print(g);
//		}
		
	}

}
