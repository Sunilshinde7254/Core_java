package Interfaces;

public class Example1_mainclass 
{
	
	void info(Example1_Bank b)
	{
		b.show();
	}
	public static void main(String[] args) 
	{
//       Example1_Axisbank ex = new Example1_Axisbank();
//       ex.show();
//       Example1_Sbibank sb = new Example1_Sbibank();
//       sb.show();
		
		// Patent p = new child concept
		Example1_mainclass ex =new Example1_mainclass();
		ex.info(new Example1_Axisbank());
		ex.info(new Example1_Sbibank());
	}
}
