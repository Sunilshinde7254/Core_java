package Constructor;

public class Constructor_demo1 
{
	int id;
	float esal;
	String address;
	String name ;
	
	public Constructor_demo1(int id , float esal , String address , String name) 
	{
       this.id = id;
       this.esal = esal;
       this.address= address;
       this.name = name;
	}
	
	void show ()
	{
		System.out.println(id);
		System.out.println(esal);
	}
	void Disply()
	{
		System.out.println(address);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		 Constructor_demo1 demo = new Constructor_demo1(20, 45000, "ECIL CROSS ROAD", "Sunil");
		 demo.show();
		 demo.Disply();
	}
} 
