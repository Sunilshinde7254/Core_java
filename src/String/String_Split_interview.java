package String;

public class String_Split_interview 
{ 
	public static void main(String[] args) 
	{ 
		String input="My name is Sunil";
		
		String[]arr = input.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
