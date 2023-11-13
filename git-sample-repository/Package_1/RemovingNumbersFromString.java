package Package_1;

public class RemovingNumbersFromString {

	public static void main(String[] args) 
	{
		String name = "96Qed25ge6 Techno54logi548es51";
		char[] a = name.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			if(Character.isDigit(a[i])) // if the character is digit, it will print otherwise it moves to next character
//			{
//				System.out.print(a[i]);
//			}
//		}
//		System.out.print(" ");
//		
		for(char x : a)
		{
			if(!Character.isDigit(x)) // if the character is not a digit, 
				                      // It will print that character otherwise it moves to next character
			{
				System.out.print(x);
			}
		}
	}

}
