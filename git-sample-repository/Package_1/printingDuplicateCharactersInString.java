package Package_1;

import java.util.HashSet;

public class printingDuplicateCharactersInString {

	public static void main(String[] args) 
	{
		String str = "java is object oriented programming language";
		char[] a = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				
				if(a[j]==a[i])
				{
					//if(!String.valueOf(a[j]).isBlank())
					//{
						set.add(a[j]);
						break;
					//}
					
				}
			}
		}
		for(char x : set)
		{
			System.out.println("Repeated characters is  :  "+x);
		}
	}

}
