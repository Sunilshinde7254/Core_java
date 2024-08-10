package Abstract_class;

class Example2_sub extends Example2
{ 
	void m2()
	{
		System.out.println("Normal method 2");
	}

	@Override
	void show() {
		System.out.println("Abstract method ");
		
	}
   
}
