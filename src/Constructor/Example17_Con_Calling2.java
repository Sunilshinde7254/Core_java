package Constructor;

public class Example17_Con_Calling2 
{

	public Example17_Con_Calling2()   
	{    this(10);
	System.out.println(" 0 - arg Constructor ");
	}
	public Example17_Con_Calling2(int a)   
	{
		System.out.println(" 1 - arg Constructor ");
	}

	{    
		System.out.println(" instance block Constructor");
	}
	public static void main(String[] args) 
	{

		Example17_Con_Calling2 t = new Example17_Con_Calling2();
	}
}
