package Java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor_Ex1 
{
	
	public static void main(String[] args) {
		ArrayList<String> objs = new ArrayList<>();
		objs.add("Sunil");
		objs.add("Anil");
		objs.add("Anuja");
		objs.add("Tejal");
		
		// Read data the using for-each loop
		for(String s : objs)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------1 ");
		// Read data the using get() method
		String name = objs.get(2);
		System.out.println(name);
		
		System.out.println("--------------------------------2 ");
		// Read the data using normal cursor :Iterator
		Iterator itr = objs.iterator();
		while(itr.hasNext())
		{
			String s= (String)itr.next();
			System.out.println(s);
		}
		System.out.println("--------------------------------3 ");
		// Read the data using generic cursor :Iterator
		Iterator <String>sitr = objs.iterator();
		while(itr.hasNext())
		{
			String s = sitr.next();
			System.out.println(s);
		}
		
		System.out.println("--------------------------------4 ");
		// Read the data using forEach () method : using lambda : java 8
		objs.forEach(str->System.out.println(str));
		
		System.out.println("--------------------------------5 ");
		// Read the data using forEach () method : using method reference : java 8
		objs.forEach(System.out::println);
		
	}
}
