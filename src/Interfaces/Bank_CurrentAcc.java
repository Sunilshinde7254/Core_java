package Interfaces;

public class Bank_CurrentAcc implements Bank
{

	
	public void CashDepost() 
	{

		System.out.println("Current account Deposit: 200000");
	}
	public void Withdraw() 
	{
		System.out.println("Current account withdraw limit 50000");

	}
	public void loan() 
	{
		System.out.println("Current account loan amount 100000");

	}

}
