package Package_1;

public class RemoveSpacesFromString {
	
	public class one
	{
		public  void pri()
		{
			System.out.println("1");
		}
	}

	public class two extends one
	{
		public void print()
		{
			System.out.println("2");
		}
	}

	public static void main(String[] args) 
	{
//		one ob = new one();
		
//		String name = " Qedge Technologies ";
//		String x = name.replaceAll("\\s", ""); // replaceAll replace all spaces with no space
//		String y = name.trim(); // trim removes start and end spaces of a string
//		System.out.println(y);
//		System.out.print(x);
		
		String str = "Hello123";
		
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		char thirdChar = str.charAt(2);
		char forthChar = str.charAt(3);
		char fifthChar = str.charAt(4);
		char sixChar = str.charAt(5);
		char seventhChar = str.charAt(6);
		char eightChar = str.charAt(7);
		
		System.out.println(firstChar+""+secondChar+""+thirdChar+""+forthChar+""+fifthChar+""+sixChar+""+seventhChar+""+eightChar);
		
		
		
		
	}

}


