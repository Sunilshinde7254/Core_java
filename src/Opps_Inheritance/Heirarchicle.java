package Opps_Inheritance;

public class Heirarchicle 
{
	public static void main(String[] args) 
	{
       Son1 s1 =new Son1();
       s1.Car();
       s1.home();
       s1.land();
       s1.mobile();
       
       System.out.println(".........Feature of Son2......");
       Son2 s2 = new Son2();
       s2.Car();
       s2.home();
       s2.land();
       s2.Mobile1();
       
       
       System.out.println(".........Feature of Son3......");
       Son3 s3 = new Son3();
       s3.Car();
       s3.home();
       s3.land();
       s3.Mobile2();
       
	}
}
