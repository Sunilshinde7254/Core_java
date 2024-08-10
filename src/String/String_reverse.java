package String;

public class String_reverse 
{
    public static void main(String[] args) 
    {
		 String s1 = "SunilShinde";
		 String rev = "";
		 
		 for(int i = s1.length()-1 ;i>=0;i--)
		 {
			 rev = rev+s1.charAt(i);
			 
		 }
		 
		 System.out.println("Reverse String : "+rev);
		 
		 
		 System.out.println("----------------------------------------");
		 if(s1.equals(rev))
		 {
			 System.out.println("String ispalindrome");
		 }
		 else
		 {
	         System.out.println("String is not palindrome");
		 }
	}
}

