package Interfaces;

public class Bank_SalaryAcc implements Bank
{


	public void CashDepost() 
	{

		System.out.println("Salary account Deposit: 200000");
	}
	public void Withdraw() 
	{
		System.out.println("Salary account withdraw limit 50000");

	}
	public void loan() 
	{
		System.out.println("Salary account loan amount 100000");

	}

}
