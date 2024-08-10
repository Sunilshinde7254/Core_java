package Control_Condition;

public class Example6_switch 
{
	public static void main(String[] args) 
	{
       String ATM = "CP";
       
       switch(ATM)
       {
       case "CP" :
       {
    	   System.out.println(" Change Password");
       break;
       }
       
       case "MS":
       {
    	   System.out.println(" Mini Statement");
    	   break;
       }
       case "CW" :
       {
    	   System.out.println(" Cash withdrw");
    	   break;
       }
       default:
    	   System.out.println("Invalid option");
       
       }
	}
}
