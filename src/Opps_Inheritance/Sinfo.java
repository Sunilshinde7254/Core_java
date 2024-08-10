package Opps_Inheritance;

public class Sinfo extends Student
{
	Sinfo(int id, int mark, String name) 
	{
		super(id, mark, name);
		
	}
	void info()
	{   
		System.out.println("University Name:SPPU");
		System.out.println("Collage name:JSPM");
		System.out.println("Collage city:"+collage_City);
	}
	public static void main (String[] args)
	{
       Sinfo sn = new Sinfo(12,89,"Sunil");
       sn.info();
       sn.studentinfo();
	}
}
