package Access_specifier2;

import Access_specifier.Example1;

public class ExampleSubclass extends Example1
{
   protected void disp() 
   {
	System.out.println("Sub class");
}
   public static void main(String[] args) {
	ExampleSubclass ex = new ExampleSubclass();
	ex.disp();
	ex.show();
	System.out.println("Num: "+ex.num);
	
//	Example1 ex2 = new Example1(); 
//	ex2.show();
//	
	
}
}
