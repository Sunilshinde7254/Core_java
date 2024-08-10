package Exception_Handling;

public class Example6 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"}; 
	try
	{
	System.out.println(ar[6]); //risky code
	}
	catch (ArithmeticException e)
	{
	System.out.println("Arithmetic Exception handled");
	}
	catch (StringIndexOutOfBoundsException e) 
	{
	System.out.println("StringIndexOutOfBounds Exception handled");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("ArrayIndexOutOfBounds Exception");
	}
	System.out.println("Hi");
	}

}
