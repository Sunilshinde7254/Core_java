package Interfaces;

public class Interface_Test implements Interface_IT1,Interface_IT1.IT2
{

	
	public void m2() 
	{
		System.out.println("Method 1 outer interface");
		
	}

	
	public void m1() 
	{
		
		System.out.println("Method 2 inner interface");
	}
 public static void main(String[] args) 
 {
	 Interface_Test er  = new Interface_Test();
	 er.m1();
	 er.m2();
}
}
