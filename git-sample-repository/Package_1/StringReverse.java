package Package_1;

public class StringReverse {

	public static void main(String[] args) 
	{
		String name = "Qedge Technologies";
		
		for(int i=1;i<=name.length();i++)
		{
			char x = name.charAt(name.length()-i);
			System.out.print(x);
		}
		
		// printing the given string in reverse
		
		String str = "madhu";
		for(int i=1;i<=str.length();i++) {
			char a=str.charAt(str.length()-i);
			System.out.print("\n"+a);
		}
		
		// String reverse using "StringBuffer"
		
		String s = "madhu is very bad boy";
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

	}

	

}
