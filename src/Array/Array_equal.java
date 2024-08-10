package Array;

import java.util.Arrays;

public class Array_equal 
{
	public static void main(String[] args) 
	{
       int arr1 [] = {10,20,40,50};
       int arr2 [] = {10,80,30,70};
       
       System.out.println(Arrays.equals(arr1, arr2));
       
       System.out.println("-----------");
       
       int arr3 [] = {40,20,30,10};
       int arr4 [] = {20,30,10,40};
       Arrays.sort(arr3);
       Arrays.sort(arr4);
       System.out.println(Arrays.equals(arr3, arr4));
       
       
	}
}
