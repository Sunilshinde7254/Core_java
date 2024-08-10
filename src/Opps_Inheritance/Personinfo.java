package Opps_Inheritance;

public class Personinfo extends Person
{

	 Personinfo(int id, int age, String name) 
	{
		super(id, age, name);
		
	}
	
	void Message()
	{
		System.out.println(" Thak you ");
	}
	public static void main(String[] args) 
	{
		Personinfo p1 = new Personinfo(01, 20, "Sunil");
		
		p1.info();
		p1.Message();
		
	}
 
}
