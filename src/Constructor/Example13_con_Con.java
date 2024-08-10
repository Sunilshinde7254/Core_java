package Constructor;

public class Example13_con_Con 
{ 
	int num1 ;
	int num2;
	public Example13_con_Con() 
	{
		num1 = 10;
		num2 =  20;

	}
	Example13_con_Con(int a , int b)
	{
      num1 = a;
      num2 = b;
	}
	public void add() 
	{
		System.out.println(num1 + num2);
	}
	public void mul() 
	{
		System.out.println(num1 * num2);
	}


	public static void main(String[] args) 
	{
		Example13_con_Con ex = new Example13_con_Con();
		ex.add();
		ex.mul();
		Example13_con_Con Ex1 = new Example13_con_Con(10 ,20);
		Ex1.add();
		Ex1.mul();
		
		
	}
}
