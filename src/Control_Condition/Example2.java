package Control_Condition;

public class Example2 
{
	public static void main(String[] args) 
	{
     int marks = 78;
     
     if(marks>=75)
     {
    	 System.out.println(" Distinction ");
     }
     else if(marks>60)
     {
    	 System.out.println(" Fisrt class");
     }
     else if(marks >=50)
     {
    	 System.out.println("Second class");
     }
     else if (marks >=35)
     {
    	 System.out.println("Result Pass");
     }
     else
     {
    	 System.out.println(" FAIL");
     }
	}
}
