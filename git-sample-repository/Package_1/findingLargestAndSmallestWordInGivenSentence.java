package Package_1;

public class findingLargestAndSmallestWordInGivenSentence {

	public static void main(String[] args) 
	{
		String str = "Find largest and smallest words in a given string";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Smallest word is  :"+arr[0]);
		System.out.println("Largest word is  :"+arr[arr.length-1]);
	}

}
