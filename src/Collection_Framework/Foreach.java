package Collection_Framework;

public class Foreach 
{
	public static void main(String[] args) 
	{
         int arr [] = {10,20,40,70,80,90};
         for (int arr1 : arr) 
         {
			//System.out.println(arr1);
		}
         int index = 0;
         for(Object s1:arr)
         {
         if(index<5)
         {
         System.out.println(s1);
         }
         index++;
         }

	}
}
