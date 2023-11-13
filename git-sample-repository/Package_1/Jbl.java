package Package_1;

public class Jbl {

	public static void main(String[] args) 
	{
		//String str = "qedge technolagies";
//		String hgf = str.repeat(2);
//		System.out.println((hgf));
		
		//char countChar = 's';
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)=='e')
//			{
//				System.out.print(str.charAt(i));
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		
//		String str = "qed2ge tech5n8olag86ies";
//		System.out.println(str.replaceAll("e", ""));
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<str.length();i++)
//		{
//			if(!Character.isDigit(str.charAt(i)))
//			{
//				sb.append(str.charAt(i));
//			}
//		}
//		String a = sb.toString();
//		System.out.println(a);
		
//		String str = "qedgetechnologies";
//		char[] a = str.toCharArray();
		
//		int[] a = {2,5,6,2,7,4,9,3,8,5};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[j]>a[i])
//				{
//					int temp = a[i];
//					a[i]= a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(int x:a) {
//			System.out.print(x);
//		}
		
//		String str = "qedgetechnologies";
//		char[] a = str.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[j]<a[i])
//				{
//					char temp = a[i];
//					a[i]= a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		for(char x:a) {
//			System.out.print(x);
//		}
		
		
//		int a = 0;
//		while(a<=10)
//		{
//			System.out.println(a);
//			a=a+2;
//			
//		}
		
//		String a ="helloworld";
//		StringBuilder sb = new StringBuilder();
////		String b = a.replace("hello", "hello ");
////		System.out.println(b);
//		for(int i=0;i<a.length();i++)
//		{
//			sb.append(a.charAt(i));
//			if(i<a.length()-1)
//			{
//				sb.append(' ');
//			}
//			
//		}
//		String d = sb.toString();
//		System.out.println(d);
		
		String a= "hello2 world45";
		String b = a.replaceAll("\\s", "");
		int count =0;
		for(int i=0;i<b.length();i++)
		{
			if(!Character.isDigit(b.charAt(i)))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	

}
