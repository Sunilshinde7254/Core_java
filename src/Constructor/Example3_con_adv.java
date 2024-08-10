package Constructor;

public class Example3_con_adv 
{

	int eid ;
	String name;
	String location ;
	String company;

	public Example3_con_adv(int eid , String name , String location , String company)
	{   // assign the local data to instance data
		this.eid = eid;
		this.name = name;
		this.location = location;
		this.company = company;

	}
	void show()
	{
		if (eid>=12)
		{
			System.out.println("Good moring");
		}
		else
		{
			System.out.println("Good night");
		}
	}
	public static void main(String[] args) 
	{
     Example3_con_adv Ex = new Example3_con_adv(11, "Sunil", "HYD", "ACL");
     Ex.show();
	}
}
