package Constructor;
public class Example16_Con_Calling 
{	
		Example16_Con_Calling()
		{  
			this(10); 	                                    // calling constructor
			System.out.println(" Good Evening");
		}
		Example16_Con_Calling(int a)
		{  this(10, 20);                                           // calling constructor
			System.out.println(" Good Afternoon "+a);
		}
		
		Example16_Con_Calling(int a , int b)
		{
			System.out.println(" Good Morning "+a + " "+b) ;
		}
		public static void main(String[] args) 
		{
			Example16_Con_Calling t = new Example16_Con_Calling();
		}
	}

