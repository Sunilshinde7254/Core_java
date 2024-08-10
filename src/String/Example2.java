package String;

public class Example2 
{
 public static void main(String[] args) 
 {
	 
	 String str1 = "Hello";
	 String str2 = "Hello";
	 String str3 = new String("Hello");
	 String str4 = new String("Hello");
	 
	 // indentity checking
	System.out.println(str1==str2);   // true 
	System.out.println(str1==str3);   // false 
	System.out.println(str2==str3);   // false 
	System.out.println(str3==str4);   // false 
	
	
	// data checking
	System.out.println(str1.equals(str2));  // true
	System.out.println(str1.equals(str3));  // True 
	System.out.println(str2.equals(str3));  // True
	System.out.println(str3.equals(str4));  // True
}
 
 
}
