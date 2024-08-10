package Interfaces;

public class Test_A extends Abstrct_A implements Abstrct_A.It1
{

	
	public void m2() 
	{
		System.out.println("Method m1 abstract class");
		
	}

	
	void m1() 
	{
		
		System.out.println("Method m2 interface ");
	}
public static void main(String[] args) 
{
	 Test_A te = new Test_A();
	 te.m1();
	 te.m2();
}
}
