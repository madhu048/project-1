package Package_1;

public class ExtractingParticularPartInString {

	public static void main(String[] args) 
	{
		
		// using "SubString" method
		
		String name = "www.xyzabc.com";
		
		String firstfore = name.substring(0, 4); // Starting index is included but ending index is not included(excluded)
		System.out.println(firstfore);
		
		String lastfore = name.substring(name.length()-4, name.length());
		System.out.println(lastfore);
		
		 String specifiedpart = name.substring(4, name.length()-4);
		 System.out.println(specifiedpart);
	}

}
