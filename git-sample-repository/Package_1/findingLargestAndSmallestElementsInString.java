package Package_1;

import java.util.Arrays;

public class findingLargestAndSmallestElementsInString {

	public static void main(String[] args) 
	{
		// finding largest and smallest elements in a given integer array
		
		int[] arr = {5,88,55,4,6,9,5,6,22,4,55,524,55,4};
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Largest number is :"+arr[arr.length-1]);
		System.out.println("Smallest number is :"+arr[0]);
		
		// finding largest and smallest elements in a integer array using Arrays class
		
		int[] x = {5,68,5,6,5,4,2,4,82,4,5,72,5};
		Arrays.sort(x);
		System.out.println("largest number is :"+x[x.length-1]);
		System.out.println("smallest number is :"+x[0]);
	}

}
