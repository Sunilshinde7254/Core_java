package Exception_Handling;

public class Example8 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"}; 
	try
	{
	System.out.println(ar[5]); 
	}
	catch (ArithmeticException e)
	{
	System.out.println("Arithmetic Exception handled");
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	System.out.println("ArrayIndexOutOfBounds Exception handled");
	}
	catch (Exception e)
	{
	e.printStackTrace();
	System.out.println("generic Exception handled");
	}
	System.out.println("Hi");
	}

}
