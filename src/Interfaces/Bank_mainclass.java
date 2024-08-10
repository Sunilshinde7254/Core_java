package Interfaces;

public class Bank_mainclass 
{
	public static void main(String[] args) 
	{
      System.out.println("Feature of saving account");
      
      Bank_SaveAcc sc = new Bank_SaveAcc();
      sc.CashDepost();
      sc.loan();
      sc.Withdraw();
      
      System.out.println("Feature of Current account");
      Bank_CurrentAcc cc = new Bank_CurrentAcc();
      cc.CashDepost();
      cc.loan();
      cc.Withdraw();
      
      System.out.println("Feature of Salary account");
      Bank_SalaryAcc ac = new Bank_SalaryAcc();
      ac.CashDepost();
      ac.loan();
      ac.Withdraw();
      
      
	}
}
