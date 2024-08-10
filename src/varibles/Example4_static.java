package varibles;

public class Example4_static 
{
	static int num = 20;
	
	public static void main(String[] args) 
	{
      System.out.println(num);
      m1();
      new Example4_static(). m2();
	}
	
	public static void m1()
	{
		System.out.println(num);
	}
	
	public void m2()
	{
		System.out.println(num);
	}
	
}
