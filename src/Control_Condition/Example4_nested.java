package Control_Condition;

public class Example4_nested 
{
   public static void main(String[] args)
   {
	int marks = 350;
	int mains_marks = 900;
	int final_marks = 1200;
	if(marks>=350)
	{
	  System.out.println(" Eligible to mains Exam ");
	 
	  if(mains_marks  >= 850)
	  {
		  System.out.println(" You are eligible for next round");
		  
		
		  if(final_marks>=1200)
		  {
			  System.out.println(" Conguractional you are  finally selected");
		  }
		  else
		  {
			 System.out.println("Sorry best luck next time");
		  }  
	  }
	  else
	  {
		  System.out.println(" You are not aligible for interview");
	  }
	  
	}
	else
	{
		System.out.println("Your are not eligible for next stage");
	}
}
}
