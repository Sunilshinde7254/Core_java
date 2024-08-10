package Opps_Inheritance;

public class Child extends Parent
{
 void Mobile2()
 {
	 System.out.println("Son_Mobile:Iphone15");
 }
 public static void main(String[] args) {
	Child ch = new Child();
	
	
	ch.Home();
	ch.car();
	ch.Mobile();
	ch.money();
	ch.Mobile2();
}
}
