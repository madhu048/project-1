package Package_1;

import java.util.ArrayList;
import java.util.HashSet;

public class findingDuplicatesInArray {

	public static void main(String[] args) 
	{
		// finding duplicates in integer array using HashSet collection
		
//		int[] arr = {1,2,5,5,4,8,6,6,3,5,5,7,9,4};
//		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i;j<arr.length;j++)
//			{
//				if(j!=i&&arr[i]==arr[j])
//				{
//					hs.add(arr[i]);
//				}
//			}
//		}
//		for(Integer x:hs)
//		{
//			System.out.println("Duplicate element is :"+x);
//		}
		
		// finding duplicates in string array using HashSet collection
	
//		String[] str = {"and","are","and","a","a","the","be","c","are"};
//		
//		HashSet<String> set = new HashSet<String>();
//		for(int i=0;i<str.length;i++)
//		{
//			for(int j=0;j<str.length;j++)
//			{
//				if(j!=i&&str[i]==str[j])
//				{
//					set.add(str[i]);
//				}
//			}
//		}
//		for(String y:set)
//		{
//			System.out.println("Duplicate word is :"+y);
//		}
		
		// finding duplicates without using HashSet
		
		int[] arr = {1,2,5,5,4,8,6,6,3,5,5,7,9,4};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(j!=i&&arr[i]==arr[j])
				{
					for(Integer k:list)
					{
						if(arr[i]==list.get(k))
						{
							break;
						}
						if(k==list.size()-1)
						{
							list.add(arr[i]);
						}
					}
					
					
				}
			}
		}
		for(Integer r:list)
		{
			System.out.println("Duplicate element is :"+r);
		}
		
	}

}
