package Method;

public class Sample3 
{
  void m2()
  {
	  System.out.println(" Method m2");
  }
}



class Test{
	
	static int num1 = 100;
	static int num2 = 200;
	
	public static void main(String args[])
	{   // static method
		System.out.println(Test.num1+ Test.num2);
		Test t = new Test();
		
		t.add();
		
	}
	//instance method
	void add()

 	{  // instance area 
		System.out.println(Test.num1 + Test.num2);
	}	
}
             	 