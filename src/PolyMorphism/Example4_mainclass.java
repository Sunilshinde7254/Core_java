package PolyMorphism;

public class Example4_mainclass extends Example4
{ 
	void show()
	{
		System.out.println("Sub class");
	}
	public static void main(String[] args) 
	{
          Example4_mainclass e4 = new Example4_mainclass();
          e4.show();
          e4.show(20);
          
          
          
	}
}
