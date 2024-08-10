package PolyMorphism;

public class Example2_overriding extends Example2
{
	void show()
	{
		System.out.println("Overriding");
	}
	void disp()
	 {
		 System.out.println("Black car");
	 }
	public static void main(String[] args) 
	{
         Example2_overriding ex =  new Example2_overriding();
         ex.show();
         ex.disp();
	}
}
