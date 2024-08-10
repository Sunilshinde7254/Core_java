package Abstract_class;

public class Example7_sub3 extends Example7_sub2
{

	@Override
	int add(int num, int num2) 
	{
		System.out.println(num +num2);
		return 0;
	}

	@Override
	void show() 
	{
		System.out.println("Good Morning");
	}
	public static void main(String[] args) 
	{
        Example7_sub3 ex = new Example7_sub3();
        ex.login("Sunil", "Sunil123");
        ex.totalbill("Mobile", 100000, 2);
        ex.add(12, 20);
        ex.show();
      

	}
}
