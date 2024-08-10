package String;

public class Example4 
{
	public static void main(String[] args) 
	{
        String s1 = "  Sunil  ";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.trim().length());
        
        String s2 = "Ratan";
    	System.out.println(s2);
    	System.out.println(s2.charAt(2));
    	System.out.println(s2.charAt(1));
    	
    	String s3 = "Hii This is Sunil Shinde";
    	System.out.println(s3.startsWith("Hii"));
    	System.out.println(s3.startsWith("Fine"));
    	System.out.println(s3.endsWith("Shinde"));
    	System.out.println(s3.endsWith("Fine"));
    	
    	String s4 = "Hello How are you";
    	System.out.println(s4.toUpperCase());
    	System.out.println(s4.toLowerCase());
    	
    	String s5 = "hii Sunil Anil";
    	System.out.println(s5.contains("Sunil"));
    	System.out.println(s5.contains("Amol"));
    	
    	String s6 = "hii Tejal  ";
    	System.out.println(s6.replace('h', 'H'));
    	System.out.println(s6.replace("Tejal", "Anuja"));
    	System.out.println(s6.replace(" " , ""));
    	
    	String s7 = "sunilShinde";
    	System.out.println(s7.substring(3));
    	System.out.println(s7.substring(0,8));
    	
    	
    	        
	}
}
