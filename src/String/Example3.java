package String;

public class Example3 
{
	public static void main(String[] args) 
	{
        String s1 = "   Sunil   ";
        String s2 = "Shinde";
        
        String s3 = "ABCD";
        String s4 = "Hii this is sunil shinde";
        String s5 = "abcd";
        
        
        System.out.println(s1.length());
        System.out.println(s1.trim().length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        // equals method
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
        System.out.println(s4.contains("sunil"));
        
        
	}
}
