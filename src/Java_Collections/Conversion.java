package Java_Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Conversion 
{
	public static void main(String[] args) 
	{ 
		// Conversion of Array to Collections
		String [] str = {"Sunil","Anu","Anil"};
		ArrayList<String> objs = new ArrayList<String>(Arrays.asList(str));
		objs.add("Anuja");
		objs.add("Tejal");
		System.out.println(objs);

//		// Conversion of genrics version Collections to Array
//		ArrayList<String> a1 = new ArrayList<String>();
//		a1.add("Shubham");
//		a1.add("Abhi");
//		a1.add("Anu");
//		a1.add(null);
//
//		String[] s = new String[a1.size()];
//		a1.toArray(s);
//		for(String ss :s)
//		{
//			System.out.println(ss);
//		}
//		// Conversion of Normal version Collections to array
//		ArrayList data =  new ArrayList();
//		data.add(10);
//		data.add(10.5);
//		data.add("Sunil");
//
//		Object[] o= data.toArray();
//		for(Object oo :o)
//		{
//			System.out.println(oo);
//		}


	}
}
