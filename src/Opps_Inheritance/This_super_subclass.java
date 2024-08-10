package Opps_Inheritance;

public class This_super_subclass extends This_Super
{
 int  a = 20;
 void show()
 {
	 int a = 30;
	 System.out.println(a);          // local varible
	 System.out.println(this.a);    // 20
	 System.out.println(super.a);  // 10 
 }
 public static void main(String[] args) 
 {
	This_super_subclass sb = new This_super_subclass();
	sb.show();
}
}
