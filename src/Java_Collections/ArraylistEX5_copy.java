package Java_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistEX5_copy
{
	public static void main(String[] args) 
	{
      ArrayList<String> objs = new ArrayList<String>(Collections.nCopies(10, "Sunil"));
      System.out.println(objs);
      
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("Sunil");
      a1.add("Anil");
      a1.add("Anuja");
      a1.add("Tejal");
      System.out.println("Before Swapping :"+a1);
      Collections.swap(a1, 1, 3);
      System.out.println("After Swapping :"+a1);
      
	}
}
