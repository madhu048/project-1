package Package_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountingRepeatedLettersInString {

	public static void main(String[] args) 
	{
		// counting particular character occurrence in a string using splitAll function
		
		String str = "it is a sample programme";
		int lng = str.length()-str.replaceAll("m","").length();
		System.out.println("the occurrence of 'm' letter  :  "+lng);
		System.out.println(str.length());
		System.out.println(str.replaceAll("m","").length());
		
//		// counting particular character occurrence in a string
//		
//		String name = "Qedge Technologies";
//		char[] a = name.toCharArray();
//		int count=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]=='e') // it will count e letter repetition 
//			{
//				count++;
//			}
//		}
//		System.out.println("'e' repeated "+count+" times");
//		
//		// printing the duplicate characters in a given string using "HashSet"
//		
//		String name1 = "Qedge Technologies";
//		char[] a1 = name1.toCharArray();
//		HashSet <Character> w = new HashSet(); // HashSet not allows duplicate values
//		for(int i=0;i<a1.length;i++)
//		{
//			for(int j=i+1;j<a1.length;j++)
//			{
//				if(a1[i]==a1[j])
//				{
//					w.add(a1[j]); // adding matched character into HashSet
//					break;
//				}
//			}
//		}
//		for(char p : w)
//		{
//			System.out.print(p);
//		}
		
		// counting the occurrence of characters in a given string using "HashMap"
		
		String name2 = "Qedge Technologies" ;
		char a2[] = name2.toCharArray();
		
		Map<Character, Integer> maparr =  new HashMap<Character, Integer>();
		
		for(char x : a2)
		{
			//if(!String.valueOf(x).isBlank()) //if the character is space/blank, it does not add to map list
			//{
				if(maparr.containsKey(x))
				{
					maparr.put(x, maparr.get(x)+1);
				}
				else
				{
					maparr.put(x, 1);
				}
			//}
			
			
		}
		System.out.println(name2 + " : "+maparr);
		
	}
	


}
