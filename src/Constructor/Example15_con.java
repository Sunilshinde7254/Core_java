package Constructor;

public class Example15_con 
{
	int num1;
	int num2;

	public Example15_con(int num1,int num2) 
	{ 

		this.num1=num1;
		this.num2=num2;
	}
	public void add() 
	{

		System.out.println(num1 + num2 );
	}
	public void mul()
	{
		System.out.println(num1 * num2);
	}
}
