package Constructor;

public class Testsub extends Testsuper
{
	public Testsub() 
	{
	  this(10);
	}
	public Testsub(int i) 
	{
		 super(i);
		 System.out.println("Super class");
	}
	public static void main(String[] args) 
	{
		Testsub ts = new Testsub();
		Testsub ts1 = new Testsub(20);
		
	}
}
