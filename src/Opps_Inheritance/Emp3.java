package Opps_Inheritance;

public class Emp3 extends Emp2{
	void EmpAddress()
	{
		System.out.println("Flat no C1-803 magestique city wagholi pune");
	}
	public static void main(String[] args) 
	{
        Emp3 e3 = new Emp3();
        e3.empinfo(01,67000, "Sunil", " R&D");
        e3.office();
        e3.EmpAddress();
	}
}
