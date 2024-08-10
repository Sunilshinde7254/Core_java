package Abstract_class;

abstract class Example7_sub1 extends Example7_ServiceClass
{

	@Override
	String login(String username, String password) 
	{
		if(username == "Sunil" && password == "Sunil123" )
		{
			System.out.println("Login Sucessfull");
		}
		else
		{
			System.out.println("Invalid Data");
		}
		return null;
	}

	
	
 
}
