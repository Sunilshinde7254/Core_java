package String;

public class Example6
{
	public static void main(String[] args) 
	{
        String s1 ="  Sunil";
        String s2 = "";
        String s3 ="Shinde";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        
        System.out.println(s1.charAt(1));
        System.out.println(s1.indexOf('n'));
        System.out.println(s1.lastIndexOf('n'));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0,2));
        System.out.println(s1.concat(s3));
        
        System.out.println(s1.trim());
        System.out.println(s3.replace("Shinde", "Anil"));
        
        String s4 = "My name is Sunil";
        String []arr = s4.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[3]);
        for(String ar:arr)
        {
        	System.out.println(ar);
        }
        
       
        
	}
}
