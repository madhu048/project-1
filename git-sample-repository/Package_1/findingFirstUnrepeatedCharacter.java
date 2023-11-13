package Package_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findingFirstUnrepeatedCharacter {

	public static void main(String[] args) 
	{
		// finding first non repeated character without using collections
//		String str = "This is The practicing programme "; 
//		char[] a = str.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			boolean flag = true;
//			
//			for(int j=0;j<a.length;j++)
//			{
//				if(i!=j&&a[i]==a[j])
//				{
//					flag=false;
//					break;
//				}
//			}
//			if(flag)
//			{
//				System.out.println(a[i]);
//				break;
//			}	
//		}
		// finding first non repeated character using collections
		String str1 = "This is The practicing programme ";
		char[] b = str1.toCharArray();
		
		// linkedHashMap stores values in insertion order
		Map<Character, Integer> arr = new LinkedHashMap();
		
		
		for(int i=0;i<b.length;i++)
		{
			if(arr.containsKey(b[i]))
			{
				arr.put(b[i], arr.get(b[i])+1);
			}else
			{
				arr.put(b[i], 1);
			}
		}
		for(Entry<Character,Integer> entryset : arr.entrySet())
		{
			if(entryset.getValue()==1)
			{
				System.out.println(entryset.getKey());
				break;
			}
		}
	}

}
