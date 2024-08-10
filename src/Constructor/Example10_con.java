package Constructor;

public class Example10_con 
{
	
	int num1 ;
	int num2;
	 Example10_con(int a ,int b) 
	 {
		num1 = a;
		num2 = b;
	}
//	 Example10_con(int num1 ,int num2) 
//	 {
//		num1 = num1;
//		num2 = num2;
//	}
	 void add()
	 {
		 System.out.println(num1+num2);
	 }
	 void mul()
	 {
		 System.out.println(num1*num2);
	 }
 public static void main(String[] args) 
 {
	Example10_con ex = new Example10_con(10, 20);
	ex.add();
	ex.mul();
	Example12_con ex1 = new Example12_con(102, 23);
	ex1.sub();
}
}
