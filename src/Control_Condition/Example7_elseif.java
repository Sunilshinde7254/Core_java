package Control_Condition;

public class Example7_elseif 
{
public static void main(String[] args) {
	
	int shareprice = 345;
	if(shareprice >= 400)
	{
		System.out.println(" pass");
		
	}
	else if(shareprice >=400 & shareprice <=449)
	{
		System.out.println(" Agin pass");
	}
	else if(shareprice >=350 & shareprice <=399)
	{
		System.out.println(" Agin pass pass");
	}
	
	else
	{
		System.out.println(" Fail");
	}
}
}
