package Exception_Handling;

public class Example5 
{
	public static void main(String[] args)
	{
	String [] ar= {"abc","xyz","abc1"}; 
	 System.out.println(ar[5]);
	try
	{
	System.out.println(ar[7]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Please enter Valid index from 0 to "+(ar.length-1)); //alternate solution 2
	}
	System.out.println("Hi");
	}
}
