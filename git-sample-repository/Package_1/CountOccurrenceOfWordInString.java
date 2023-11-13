package Package_1;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfWordInString {

	public static void main(String[] args) 
	{
		// counting same words occurrence in a given string
		
		String str = "i am learning learning java java java programming";
		String name[]=str.split(" ");
		
		Map<String, Integer> strarr = new HashMap<String, Integer>();
		for(String x : name)
		{
			if(strarr.containsKey(x))
			{
				strarr.put(x, strarr.get(x)+1);
			}else
			{
				strarr.put(x, 1);
			}
		}
		System.out.println("srt  :  "+strarr);
		
		// counting occurrence of same character in a given string
		
		String str1 = "Java is a object orienated programming language";
		char[] name1 = str1.toCharArray();
		Map<Character, Integer> chararr = new HashMap<Character, Integer>();
		
		for(char x : name1)
		{
			
				if(chararr.containsKey(x))
				{
					chararr.put(x, chararr.get(x)+1);
				}else
				{
					chararr.put(x, 1);
				}
		}
		
		System.out.println("name1  :  "+chararr);
	}
	

}
