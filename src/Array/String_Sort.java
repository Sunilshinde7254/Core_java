package Array;

import java.util.Arrays;

public class String_Sort 
{
	public static void main(String[] args) 
	{
       String [] arr = new String[5];
       arr[0]= " Sunil";
       arr[1]= " Anil";
       arr[2]= " Tejal";
       arr[3]= " Anuja";
       arr[4]= " Sunil";
       
       for(int i =0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
       System.out.println("---------------------");
      Arrays.sort(arr);
      for(int i =0;i<arr.length;i++)
      {
   	   System.out.println(arr[i]);
      }
      
      System.out.println("---------------------");
      for(int i =arr.length-1;i>=0;i--)
      {
   	   System.out.println(arr[i]);
      }
      
	}
}
