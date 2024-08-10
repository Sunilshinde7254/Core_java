package String;

public class Example1 
{
 public static void main(String[] args) 
 {
	String s1 = "Sunil";
	String s2 = "Sunil";
	
	String s3 = new String("Sunil");
	String s4 = new String("Anil");
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s3==s4);
	
	
}
}
