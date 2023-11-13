package Package_1;

import java.util.HashMap;
import java.util.Map;

public class CountingDupicateStringsInArray {

	public static void main(String[] args) 
	{
		String names[] = {"madhu","Kiran","banti","madhu","Kiran"};
		
		Map<String, Integer> strarr = new HashMap<String, Integer>();
		
		for(String x : names)
		{
			if(strarr.containsKey(x))
			{
				strarr.put(x, strarr.get(x)+1);
			}else
			{
				strarr.put(x, 1);
			}
		}
		
		System.out.println(strarr);
	}

}
