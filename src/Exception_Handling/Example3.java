package Exception_Handling;

public class Example3 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"};
	try
	{
	System.out.println(ar[6]); //risky code
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("exception handled"); //option
	}
	System.out.println("Hi");
	}
}
