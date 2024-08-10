package Opps_Inheritance;

public class Test2 extends Test
{
	void m3()
	{
		System.out.println("Method m3");
	}
	public static void main(String[] args) 
	{
      Test2 t2 = new Test2();
    //  t2.m1();
      Test.m1();
      t2.m2();
      t2.m3();
	}
}
