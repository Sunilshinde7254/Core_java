package varibles;

public class Example_instance 
{
	int num1 = 10;
	int num2 = 20;
     int res;
   
     
    static final int num;
    
    static
    {
  	  num =10;
    }
    void disp()
    {
  	  System.out.println(num);
    }
    
	
	public void m1()
	{
	  	res = num1 + num2;
	  	System.out.println(num1);
	  	System.out.println(num2);
	  	System.out.println(res);
	  
	}
  public static void main(String[] args) 
  { 
	  Example_instance ex = new Example_instance();
	  ex.m1();
	  ex.disp();
	  
}
}
