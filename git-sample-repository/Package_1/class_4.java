package Package_1;

public class class_4 
{
	public static void method_1(int age)
	{
		/*//System.out.println(age);
		
		if(age>=20)
		{
			System.out.println("access granted");
		}else
		{
			System.out.println("access declaned");
		}*/
		
	}
	
	public static void main(String[] args) 
	{
		//method_1(21);
		int result = sum(10);
		System.out.println(result);
		int x= sum(20);
		System.out.println(x);
		System.out.println(sum1(30));

	}
	public static int sum(int i)
	{
		if(i>0)
		{
			return i+sum(i-1);
		}else
		{
			return 0;
		}
	}
	public static int sum1(int z)
	{
		if(z>0)
		{
			return z+sum(z-1);
		}else
		{
			return 0;
		}
	}
	


}
