package Java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorEx3_Iterator 
{ 
	public static void main(String[] args) 
	{
		ArrayList<String> objs = new ArrayList<>();
		
		objs.add("Sunil");
		objs.add("Anil");
		objs.add("Anuja");
		objs.add("Abhi");
		objs.add("tejal");
		
		Iterator<String> itr = objs.iterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			if(s.equals("Abhi"));
			itr.remove();
		}
		System.out.println(objs);
	}

}
