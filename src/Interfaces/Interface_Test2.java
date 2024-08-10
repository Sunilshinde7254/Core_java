package Interfaces;

public interface Interface_Test2 
{
  void m1();
  default void m2()
  {
	  System.out.println("Default value ");
  }
  static void m3()
  {
	  System.out.println("Static method");
  }
  
}
