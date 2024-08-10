package String;

public class Example5 
{
	public static void main(String[] args) 
	{
		String s1 = "Sunil";
		String s2 = "Shinde";
		System.out.println(s1.concat(s2));
		
		// String is immutable : modification not possible 
		String str1 = "Sunil";   
		str1.concat("Shinde");
		System.out.println(str1);
	}
}
