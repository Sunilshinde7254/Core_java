package Control_Condition;

public class Example3 
{
	public static void main(String[] args) 
	{
       int marks = 59;
       
       if(marks >=75)
       {
    	   System.out.println(" Distinction");
       }
       else if (marks>=60 & marks <=74)
       {
    	   System.out.println("First class");
       }
       else if(marks>=50 & marks <=59)
       {
    	   System.out.println("Second class");
       }
       else  if (marks >=35 & marks <=49)
       {
    	   System.out.println(" Result pass");
       }
       else
       {
    	   System.out.println("FAIL");
       }
    	   
	}
}
