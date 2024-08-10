package Opps_Inheritance;

public class Examplechild extends Exampleparent
{
public Examplechild(int num1) {
		super(num1);
		
	}
void disp()
{
	System.out.println(" subclass class");
}
public static void main(String[] args) 
{
//	Exampleparent ex = new Exampleparent(10);
//	ex.show();
	
	Examplechild ex2 = new Examplechild(10);
	ex2.show();
	ex2.disp();
	
	
}
}
