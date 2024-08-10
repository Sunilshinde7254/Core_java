package Exception_Handling;

public class Example1 
{
	public static void main(String[] args) 
	{
        int num  =10;
        try
        {
        	 int res = 10/0;
        	 System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Reest of code");
        	
        }
       
        
	}
}
