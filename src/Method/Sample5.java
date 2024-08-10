package Method;

public class Sample5 
{
	void add(int num1 , int num2)
	{
       int res = num1 + num2;
       System.out.println(res);
	}

	static void sum(int num1 , int num2)
	{
		int res = num1 + num2;
	       System.out.println(res);
	}
	public static void main(String[] args) 
	{
       Sample5 sm = new Sample5();
       sm.add(10, 23);
       sum(10, 29);
		
	}
}
