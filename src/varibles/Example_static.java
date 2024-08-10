package varibles;

public class Example_static 
{ 
	static int num1 = 10;
	static int num2 = 20;
	int res;
	public void m1()
	{
		res = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
     Example_static ex = new Example_static();
     ex.m1();
		
	}

}
