package Array;

public class Reverse_Array 
{ 
	public static void main(String[] args) 
	{
	 int [] arr = {10,50,20,80,90};
	 
	 for(int ar:arr)
	 {
		 System.out.println(ar);
	 }
	 System.out.println("Reverse Array...........");
	 for(int i= arr.length-1;i>=0;i--)
	 {
		 System.out.println(arr[i]);
	 }
	}
	

}
