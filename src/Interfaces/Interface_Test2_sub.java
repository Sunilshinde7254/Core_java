package Interfaces;

public class Interface_Test2_sub implements Interface_Test2
{

	@Override
	public void m1() 
	{
		System.out.println("Abstract method m1");

	}
	public static void main(String[] args) 
	{
		Interface_Test2_sub sb =new Interface_Test2_sub();
		sb.m1();
		sb.m2();
		Interface_Test2.m3();
		
		
//		Interface_Test2 t2 = new Interface_Test2_sub();
//		t2.m1();
//		t2.m2();
		

	}

}
