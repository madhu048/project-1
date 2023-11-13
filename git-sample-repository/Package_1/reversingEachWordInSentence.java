package Package_1;

public class reversingEachWordInSentence {

	public static void main(String[] args) 
	{
		String str = "These are automation testing interview quations";
		String[] str1 = str.split(" ");
		String result = "";
		
		for(int i=0;i<str1.length;i++)
		{
			String reverseWord = "";
			String a = str1[i];
			char[] arr = a.toCharArray();
     		for(int j=arr.length-1;j>=0;j--)
			{
				 reverseWord =reverseWord+arr[j]; 			
			}
			result=result+" "+reverseWord;	
		}
		 System.out.println(result);
	}

}
