package Constructor;

public class Example6_Con_add 
{ 
	
	static int num1 ;
	static int num2;
	public Example6_Con_add(int num1 , int num2) 
	{
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public void Add()
	{
		System.out.println(num1 + num2);
	}
	public static void main(String[] args) 
	{
        Example6_Con_add Ex = new Example6_Con_add(10, 20);
        Ex.Add();
       
	}
}
