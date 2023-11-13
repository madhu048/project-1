package Package_1;

import java.util.Arrays;

public class CheckingGivenStringsAreAnagramOrNot 
{
	public static void main(String[] args) 
	{
		String str1 = "spot";
		String str2 = "tops";
		char[] str1arr = str1.toCharArray();
		char[] str2arr = str2.toCharArray();
		Arrays.sort(str1arr);
		Arrays.sort(str2arr);
		if(Arrays.equals(str1arr, str2arr))
		{
			System.out.println("Given strings are anagram");
		}else
		{
			System.out.println("Given strings are not anagram");
		}
	}

}
