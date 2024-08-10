package Abstract_class;

public class Example1_Mainclass 
{
	public static void main(String[] args) 
	{
     Example1subclass Es = new Example1subclass();
     Es.m1();
     Es.m2();
     Es.m3();
     Es.m4();
     
     System.out.println("---------------------------");
     
     Example1 ex = new Example1subclass();   // up casting
     ex.m1();
     ex.m2();
     ex.m3();
     ex.m4();
	}
}
