package Constructor;

public class Example14_con 
{ 
	int num1 ;
	int num2;
	public Example14_con() 
	{
		num1 = 10;
		num2 =  20;

	}
	
	Example14_con(int num1 , int num2)
	{
      this.num1 = num1;
      this.num2 = num2;
	}
	Example14_con(Example14_con ex14)
	{
      this.num1 = ex14.num1;
      this.num2 = ex14.num2;
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
		Example14_con ex = new Example14_con();
		ex.add();
		ex.mul();
		System.out.println("-------------------------------------------------");
		Example14_con Ex1 = new Example14_con(10 ,20);
		Ex1.add();
		Ex1.mul();
		System.out.println("Copy Constructor");
		Example14_con Ex3 = new Example14_con(Ex1);
		Ex3.add();
		Ex3.mul();
		
		System.out.println("-------------------------------------------------");
		Example15_con ex2 = new Example15_con(10, 30);
		ex2.add();
		ex2.mul();
		
		
		
	}
}
