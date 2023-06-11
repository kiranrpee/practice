package demo;

public class demo3 
{

	public static void main(String[] args) 
	{
	
		
		new demo3().nikita();
		nikita2();
		demo4.add();
		
	}
	
	public void nikita() 
	{
	
		System.out.println("nikita");
	}
	
	public static void nikita2() 
	{
	
		System.out.println("staic");
	}
	
}


class demo4
{
	
	int a=10;
	
	public static void add()
	{
		System.out.println(new demo4().a+10);
	}
	
}
