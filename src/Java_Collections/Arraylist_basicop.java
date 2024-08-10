package Java_Collections;

import java.util.ArrayList;

public class Arraylist_basicop 
{
	public static void main(String[] args) 
	{
      ArrayList al = new ArrayList();
      al.add(10);
      al.add(10.3);
      al.add("Sunil");
      al.add("naresh");
      al.add(10);
      al.add(null);
      
      System.out.println(al);
      System.out.println(al.size());
      
      al.add(3,"Anil");
      System.out.println(al);
      
      al.remove(4);
      al.remove("Anil");
      System.out.println(al);
      
      al.set(3, "Anil");
      al.set(2, "Anuja");
      System.out.println(al);
      
      System.out.println(al.isEmpty());
      al.clear();
      System.out.println(al.isEmpty());
      
	}
}
