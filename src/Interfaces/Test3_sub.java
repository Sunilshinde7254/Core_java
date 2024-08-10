package Interfaces;

public class Test3_sub extends Test3_main
{
	@Override
	public void m3() 
	{
		System.out.println("Method 3");
		
	}
	public static void main(String[] args) 
	{
		Test3_sub sb = new Test3_sub();
		sb.m1();
		sb.m2();
		sb.m3();
	}

}
