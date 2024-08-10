package Constructor;
public class Subclass extends Superclass 
{
	Subclass() 
	{
		super(); // Calls the superclass constructor
		System.out.println("Subclass constructor");
	}
	public static void main(String[] args) 
	{
		Subclass sb = new Subclass();
		
	}
}