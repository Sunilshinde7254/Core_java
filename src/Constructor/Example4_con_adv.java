package Constructor;

public class Example4_con_adv 
{
	
	int eid;
	String name ;
	public final static String location = " HYD";
	public final static String company = " ACL";
	public Example4_con_adv(int eid , String name) 
	{
		this.eid = eid;
		this.name = name;
	}
	void show()
	{
		
		if(eid >=12)
		{
			System.out.println(" Good Morning");
			System.out.println(eid+" "+ name+" "+ location+" "+company);
		}
		else
		{
			System.out.println(" Good night");
			System.out.println(eid+" "+ name+" "+ location+" "+company);
		}
	}
	
public static void main(String[] args) 
{ 
	Example4_con_adv ex = new Example4_con_adv(12, "Sunil");
	ex.show();
}
}
