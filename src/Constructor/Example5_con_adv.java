package Constructor;

public class Example5_con_adv 
{
	void add(int num1 , int num2)
	{
		System.out.println(num1 + num2);
	}
	void sub(int num1 , int num2)
	{
		 System.out.println(num1 - num2);
	}
	void mul(int num1 , int num2)
	{
		System.out.println(num1 * num2);
	}
	void div(int num1 , int num2)
	{
		System.out.println(num1 - num2);
	}
	public static void main(String[] args) 
	{
        Example5_con_adv ex = new Example5_con_adv();
        ex.add(12, 13);
        ex.sub(12, 13);
        ex.div(12, 13);
        ex.mul(12, 13);
        
	}
}
