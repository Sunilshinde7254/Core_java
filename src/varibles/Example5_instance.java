package varibles;

public class Example5_instance 
{
	int num = 10;
	public static void m1()
	{
		Example5_instance ex1 = new Example5_instance();
		System.out.println(ex1.num);
	}
	public void m2()
	{
		System.out.println(num);
	}
	public static void main(String[] args) 
	{
       Example5_instance ex = new Example5_instance();
       System.out.println(ex.num);
       ex.m2();
       ex.m1();
    
	}
	
}
