package Array;

public class EXample8_Main
{ 
public static void main(String[] args) 
{
	EMP em1  = new EMP(111, "Sunil", 45000);
	EMP em2  = new EMP(222, "Anil", 75000);
	EMP em3  = new EMP(333, "Tejal", 65000);
	
	EMP arr[] = new EMP[3];
	arr[0] = em1;
	arr[1] = em2;
	arr[2] = em3;
	for(EMP emp:arr)
	{
		System.out.println(emp.eid+" "+emp.ename+" "+emp.esal);
	}
	
}
}
