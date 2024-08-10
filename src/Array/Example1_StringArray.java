package Array;

public class Example1_StringArray 
{
	public static void main(String[] args) 
	{
		String []arr;             // Declaration 
		 arr = new String [5];    // Instantiation
		arr[0]= "Sunil";          // initialization
		arr[1]= "Anil";
		arr[2]= "Tejal";
		arr[3]= "Anuja";
		arr[4]= "Anil";
		System.out.println(arr[0]);
		System.out.println("------------------------");
		
		for(int i= 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------");
		
		String arr1[] = {"Sunil,Anil,Tejal,Anuja"};

		for(int i= 0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}

	}


}
