package Package_1;

public class replacePartOfstringwithSubstring {

	public static void main(String[] args) 
	{
		// Print 10 multiples between 1 to 100
		
//		for(int i=1;i<=100;i++)
//		{
//			int a=10*i;
//			System.out.print(a+",");
//		}
		
		// reversing integer
		
			int a = 12345;
			String b =String.valueOf(a);
//			char[] arr = b.toCharArray();
//			for(int i=1;i<=arr.length;i++)
//			{
//				System.out.print(arr[arr.length-i]);
//			}
			
			// other way
//			for(int i=b.length();i>0;i--)
//			{
//				System.out.print(b.charAt(i-1));
//			}
			
			// other way
//			StringBuffer sb = new StringBuffer(b);
//			System.out.println(sb.reverse());
			
			// replacing a part of string with substring
			StringBuffer sb = new StringBuffer(b);
			
//			System.out.println(sb.replace(0, 4, "asdf"));
			System.out.println(sb.indexOf("asd"));
			
			
	}
	
	

}
