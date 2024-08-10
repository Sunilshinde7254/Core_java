package Array;

public class Array_Smallest_number 
{
	public static void main(String[] args) 
	{
        int arr [] = {20 ,40, 50, 10,90,70,30};
        int min = arr[0];
        int max = arr[0];
        
        System.out.println("Smallest Number in Array..........");
        for(int i =0;i<arr.length;i++)
        {
        	if(arr[i]<min)
        	{
        		min = arr[i];
        	}
        }
        System.out.println(min);
        
        System.out.println("Largest Number in Array..........");
        for(int i =0;i<arr.length;i++)
        {
        	if(arr[i]>max)
        	{
        		max = arr[i];
        	}
        }
        System.out.println(max);
	}
}
