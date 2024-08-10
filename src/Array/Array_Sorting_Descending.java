package Array;

public class Array_Sorting_Descending
{
	public static void main(String[] args) 
	{ 
		int arr [] = {20,40,10,70,50,30,60};

		int temp =0;
		for(int i = 0;i<arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) 
				{                  //If the element at index i is smaller
					              //than the element at index j, it swaps their positions.
					temp = arr[i];   
					arr[i] = arr[j];
					arr[j] = temp;     
				}
			}
			//System.out.println(arr[i]);
		}
		System.out.println("Array Sorting descending order");
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
}
