package Package_1;

import java.util.Arrays;

public class sortingIntegerInAssendingAndDessendingOrder {

	public static void main(String[] args) 
	{
//		// sorting array into ascending order without using Arrays class
//		
//		int a[] = {2,5,6,8,2,3,4,9,7};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[j]<a[i])
//				{
//					int temp = a[i];
//					    a[i] = a[j];
//					    a[j] = temp;
//				}
//			}
//		}
//		for(int x : a)
//		{
//			System.out.print(x);
//		}
		
		// sorting array into descending order without using Arrays class
//		
//		int b[] = {8,9,5,4,6,2,4,8,6,5,334,5};
//		
//		for(int i=0;i<b.length;i++)
//		{
//			for(int j=i;j<b.length;j++)
//			{
//				if(b[j]>b[i])
//				{
//					int temp = b[i];
//					    b[i] = b[j];
//					    b[j] = temp;
//				}
//			}
//		}
//		
//		for(int x : b)
//		{
//			System.out.print(x);
//		}
		
		// sorting an array using Arrays class
		
//		char[] arr = {'s','g','h','u','y'};
//		Arrays.sort(arr);
//		System.out.println(arr);
		
		// sorting integet array using Arrays class
		
		int[] arr = {5,6,2,8,7,9,1,5,6};
		Arrays.sort(arr);
		for(int x : arr) {
			System.out.println(x);
		}
		
	}

}
