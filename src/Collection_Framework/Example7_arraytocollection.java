package Collection_Framework;

import java.util.Arrays;
import java.util.List;

public class Example7_arraytocollection 
{
 
	 public static void main(String[] args)
	 {
	 String [] ar= {"mahesh", "ganesh","ramesh"};
	 List<String> al = Arrays.asList(ar);
	 System.out.println(al.get(1)); //ganesh
	 
	  Integer [] ar1= {10, 30, 40};
	  List<Integer> al2 = Arrays.asList(ar1);
	  System.out.println(al2.get(0));
	 }


}
