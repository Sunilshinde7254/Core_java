package Abstract_class;

public class Abstrt_main extends Abstart_class
{

	@Override
	void m1() 
	{
		System.out.println("Abstr class abstrct method");
		
	}
	public static void main(String[] args) 
	{
		Abstrt_main ab = new Abstrt_main();
		ab.m1();
		ab.show();
	}

}
