package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example4_Sorting 
{
	public static void main(String[] args) 
	{
        int arr [] = {20,40,60,70,10};
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	
        }
        System.out.println("----------------");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        	
        }
        System.out.println("----------------");
        for(int i=arr.length-1;i>=0;i--)
        {
        	System.out.println(arr[i]);
        }
	}
}
