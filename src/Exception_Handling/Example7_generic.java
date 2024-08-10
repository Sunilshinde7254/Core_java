package Exception_Handling;

public class Example7_generic 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"}; 
	try
	{
	System.out.println(ar[5]); 
	}
	catch (Exception e)
	{
	e.printStackTrace();
	//e.toString();
	//e.getMessage();
	System.out.println("generic Exception handled");
	}
	System.out.println("Hi");
	}
}
