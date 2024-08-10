package Loops;

public class Example12_50 
{
    public static void main(String[] args) 
    {     int exp = 50;
          double result = 1.0;
         
           int base = 5;
    
		 while (exp !=1)
		 {
			 result *= base * exp;
			 System.out.println(result);
		 }
	}
}
