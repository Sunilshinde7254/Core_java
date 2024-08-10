package Exception_Handling;

public class Example9 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"}; 
	try
	{
	System.out.println(ar[5]); //risky code 1 
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
	System.out.println("ArrayIndexOutOfBounds Exception handled");
	}
	String s1="abcd";
	try
	{
	System.out.println(s1.charAt(5)); //risky code 2
	} 
	catch (StringIndexOutOfBoundsException e)
	{
	System.out.println("StringIndexOutOfBounds Exception handled");
	}
	System.out.println("Hi");
	}
}
