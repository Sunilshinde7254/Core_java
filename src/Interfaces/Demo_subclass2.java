package Interfaces;

public class Demo_subclass2 extends Demo_class
{

	@Override
	public void m3() {
		System.out.println("Method demo_subclass 3");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Method demo_subclass 4");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method demo_subclass m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method demo_subclass m2");
	}

	@Override
	void m6() {
		// TODO Auto-generated method stub
		System.out.println("Method demo_subclass 6");
	}
	public static void main(String[] args) 
	{
		       Demo2 d2= new Demo_subclass2();
		       d2.m1();
		       d2.m2();
		       d2.m3();
		       d2.m4();
		       
		       Demo_subclass2 d3= new Demo_subclass2();
		       d3.m1();
		       d3.m2();
		       d3.m3();
		       d3.m4();
		       d3.m5();
		       d3.m6();
		      
		       
		       
	}

}
