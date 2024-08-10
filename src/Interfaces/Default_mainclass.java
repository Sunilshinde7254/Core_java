package Interfaces;

public class Default_mainclass implements Default_test
{

	@Override
	public void m1() 
	{
		System.out.println("Method 1");
		
	}

	@Override
	public void m2() {
		System.out.println("Method 2");
		
	}
public static void main(String[] args) 
{
	Default_mainclass df = new Default_mainclass();
	df.m1();
	df.m2();
	df.show();

}
}