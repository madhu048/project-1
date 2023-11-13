package Package_1;

public class class_2 extends class_1
{

	public static void main(String[] args) 
	{
		madhu obj = new madhu();
		obj.move();
	}
	

}

interface man
{
	void move();
	void fight();
}

class suresh implements man
{
	public void move()
	{
		System.out.println("move");
	}
	public void fight()
	{
		System.out.println("fight");
	} 
}

class madhu extends suresh
{
	public void move()
	{
		System.out.println("not move");
	}
}

abstract class demo
{
	public abstract void method();
}
