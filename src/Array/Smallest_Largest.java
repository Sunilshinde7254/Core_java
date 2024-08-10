package Array;

import java.util.Arrays;

public class Smallest_Largest 
{
 public static void main(String[] args)
 {
	 int arr [] = new int [5];
	 
	 arr[0] = 70;
	 arr[1] = 30;
	 arr[2] = 10;
	 arr[3] = 20;
	 arr[4] = 40;
	 Arrays.sort(arr);
	 System.out.println("Smallest number:"+arr[0]);
     System.out.println("Largest Number:"+arr[4]);	 
}
 
}
