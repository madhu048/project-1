package Package_1;

import java.util.Scanner;

public class givenStringIsPalindromeOrNot {

	public static void main(String[] args) 
	{
		// checking  whether given string is palindrome or not
		
		String name = "madhu";
		StringBuffer sb = new StringBuffer(name);
		String name1 =sb.reverse().toString();
		if(name.equalsIgnoreCase(name1))
		{
			System.out.println(name+" is a palindrome string");
		}else
		{
			System.out.println(name+" is not a palindrome string");
		}
		
		// checking  whether given string is palindrome or not using recursion process its dificult so leave it
		
		// checking  whether given string is palindrome or not using scanner class
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter your string  : ");
		String org_str = cs.next();
		StringBuffer sb1 = new StringBuffer(org_str);
		String rev_str = sb1.reverse().toString();
		if(org_str.equals(rev_str)) {
			System.out.println(org_str+" is a palindrome string");
		}
		else
		{
			System.out.println(org_str+" is not a palindrome string");
		}
		
		
	}

}
