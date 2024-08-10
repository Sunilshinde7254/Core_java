package Constructor;

public class Example7_con 
{
	 static  int num1;
	static int num2;
	
	public Example7_con() 
	{
		num1 = 30;
		num2 = 20;
	} 
	static void add()
	{
		System.out.println(num1 + num2);
	}
	
 public static void main(String[] args) 
 {
	Example7_con ex = new Example7_con();
	ex.add();
	Example8_con ex1 = new Example8_con();
	ex1.m1();
}
}
