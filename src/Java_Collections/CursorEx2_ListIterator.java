package Java_Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorEx2_ListIterator 
{
	public static void main(String[] args) 
	{
		ArrayList<String> objs = new ArrayList<>();
		objs.add("Sunil");
		objs.add("Anu");
		objs.add("Anil");
		ListIterator<String>Lstr = objs.listIterator();
		Lstr.add("Ram");
		
		while(Lstr.hasNext())
		{
			String s= Lstr.next();
			if(s.equals("Anil"))
				Lstr.remove();
			if(s.equals("Anu"))
				Lstr.set("Abhi");
		}
		System.out.println(objs);
		
	}
	

}
