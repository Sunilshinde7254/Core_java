package Exception_Handling;

public class Example4 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"};
	try
	{
	System.out.println(ar[5]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(ar[0]); //alternate solution 1
	}
	System.out.println("Hi");
	}
}
