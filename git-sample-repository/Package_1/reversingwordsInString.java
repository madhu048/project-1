package Package_1;

public class reversingwordsInString {

	public static void main(String[] args) 
	{
		String str = "i am learning manual and automation testing course in hyderabad";
		String[] str1 = str.split("\\s");
		for(int i=1;i<=str1.length;i++)
		{
			String res = str1[str1.length-i];
			System.out.print(res+" ");
		}
	}

}
