package Array;

public class Example3_CharArray 
{
 public static void main(String[] args) 
 {
	char [] arr = new char[5];
	arr[0] ='A';
	arr[1] ='B';
	arr[2] ='C';
	arr[3] ='D';
	arr[4] ='E';
	for(int i=0;i<arr.length;i++) 
	{
		System.out.println(arr[i]);
	}
	System.out.println("Length : " +arr.length);
}
}
