package Array;

public class Example5_Array 
{
	public static void main(String[] args) 
	{
		 int [] arr = {10,20,30,40};
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2]);
		 System.out.println(arr[3]);
		 
		 System.out.println("----------------------");
		 
		 for(int i =0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 System.out.println("-----------------------");
		 for(int a:arr)
		 {
			 System.out.println(a);
		 }
	}

}
