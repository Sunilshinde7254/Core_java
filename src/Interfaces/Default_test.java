package Interfaces;

public interface Default_test 
{
 void m1();
 void m2();
 default void show()
 {
	 System.out.println("Defalut method in interface");
 }
}
