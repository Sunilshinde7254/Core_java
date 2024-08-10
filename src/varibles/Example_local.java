package varibles;

public class Example_local 
{
	static int num2 = 20;
	int num3= 30;
 public void m1()
 {
	 int num1 = 10;
	 System.out.println("Local varible : "+num1);
 }
 public static void main(String[] args) 
 {
	Example_local ex = new Example_local();
	ex.m1();
	System.out.println("static varible: "+num2);
	System.out.println("instance varible: "+ex.num3);
}
}
