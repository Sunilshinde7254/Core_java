package Interfaces;

public interface Party 
{
 void eat();
 default void comman_eat()
 {
	 System.out.println(" Icecream , juce ");
 }
}
