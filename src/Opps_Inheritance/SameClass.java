package Opps_Inheritance;

class demo1
{
	void show()
	{
		System.out.println(" demo 1 ");
	}
}
class demo2 extends demo1
{
	void disp()
	{
		System.out.println(" demo 2");
	}
}

public class SameClass extends demo2
{ 
	public static void main(String[] args) 
	{
//		demo1.show();
//		demo2 d2 = new demo2();
//		d2.disp();
//		d2.show();
		
		SameClass sm = new SameClass();
		sm.disp();
		sm.show();
	}
}

