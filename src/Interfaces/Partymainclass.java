package Interfaces;

public class Partymainclass 
{
	public static void main(String[] args) 
	{
         Veg v = new Veg();
         v.comman_eat();
         v.eat();
         
         Nonveg nv = new Nonveg();
         nv.comman_eat();
         nv.eat();
	}
}
