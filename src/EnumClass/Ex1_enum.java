package EnumClass;

public class Ex1_enum 
{
	enum week
    {
 	   MON , TUE , WED , THU , FRI , SAT ,SUN;
    }
    
	static void  show( week wk)
	{
		switch (wk)
		{
		case MON: 
		{
			System.out.println("MONDAY");
		}
		case TUE: 
		{
			System.out.println("Tuesday");
			
		}
		case WED: 
		{
			System.out.println("Wensday");
			
		}
		case THU: 
		{
			System.out.println("Thirday");
			
		}
		case FRI: 
		{
			System.out.println("Friday");
			
		}
		case SAT:
		{
			System.out.println("saturday");
		}
		case SUN: 
		{
			System.out.println("Sunday");
			
		}
		
		default:
		{
			System.out.println("Invalid day");
		}
		}
	}
	public static void main(String[] args) 
	{
	
		week today = week.MON;
		show(today);
       
	}
}
