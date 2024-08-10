package Java_Collections;

import java.util.ArrayList;

public class ArrayListEX6 
{
	public static void main(String[] args) 
	{
// Constructor approch :adding on collection to another collection : one to one
      ArrayList<String> a1 = new ArrayList<String>();
      a1.add("Sunil");
      a1.add("Anil");
      ArrayList<String> a2 = new ArrayList<String>(a1);
      a2.add("Tejal");
      a2.add("Anuja");
      
      System.out.println(a2);
      
 // addAll()Approch : adding many Collection into another collection : many to one
      
      ArrayList<Integer> objs1 = new ArrayList<Integer>();
      objs1.add(10);
      objs1.add(20);
      
      ArrayList<Integer> objs2 = new ArrayList<Integer>();
      objs2.add(100);
      objs2.add(200);
      
      ArrayList<Integer> objs3 = new ArrayList<Integer>();
      objs3.addAll(objs1);
      objs3.addAll(objs2);
      objs3.add(1000);
      
      System.out.println(objs3);
      
      
	}
}
