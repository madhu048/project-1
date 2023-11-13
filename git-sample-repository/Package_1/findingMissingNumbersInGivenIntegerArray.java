package Package_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findingMissingNumbersInGivenIntegerArray {

	public static void main(String[] args) 
	{
		// for one number finding this is applicable only
		
//		int[] arr = {1,2,3,4,6};
//		int sum=0;
//		int expected_sum=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=sum+arr[i];
//		}
//		for(int i=1;i<=arr[arr.length-1];i++)
//		{
//			expected_sum=expected_sum+i;
//		}
//		System.out.println("missing number is :"+(expected_sum-sum));
		
		// other approach
		
		int[] intarr = {1,2,5,9,6,7,14,2,18};
		// first find min and max values using Arrays or for loops
		
		Arrays.sort(intarr); // array is sorted in ascending order 
		
		// now save the values between min and max values in arraylist
		
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> missingnums = new ArrayList<>();
		int a = intarr[0];
		while(a<intarr[intarr.length-1])
		{
			x.add(a);
			a++;
		}
//		for(Integer b:x) {
//		System.out.print(b); // it will print all values which are in arraylist 
//		}
		
		// now by comparing both arrays we can find missing values
		
		for(int i=0;i<x.size();i++)
		{
			for(int j=0;j<intarr.length;j++)
			{
				if(x.get(i)==intarr[j])
				{
					break;
				}
				if(j==intarr.length-1)
				{
					missingnums.add(x.get(i));
				}
			}
		}
		for(Integer z:missingnums)
		{
			System.out.println("Missing numbers is : "+z);
		}
		
	}
}