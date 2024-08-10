package Collection_Framework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{
	public static void main(String[] args) 
	{
        Vector v = new Vector<>();
        v.add("Sunil");
        v.add("Rahul"); //0
        v.add(2); //1
        v.add(65.5f); //2
        v.add('A'); //3
        v.add(null); //4
        v.add(2); //5
        v.add(null); 
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.get(3));
        System.out.println(v.size());
        System.out.println(v.contains("Rahul"));
        v.set(0, "RAHUL");
        System.out.println(v);
        
        v.add(3,"Anil");
        System.out.println(v);
        
        v.remove(1);
        System.out.println(v);
        
        System.out.println("----Print Vector data using for loop-----");
        for(int i = 0;i<v.size();i++)
        {
        	System.out.println(v.get(i));
        }
        
        
        System.out.println("----Print Vector data using foreach loop-----");
        
        for(Object s1: v)
        {
        System.out.println(s1);
        }
        System.out.println("----Print Vector data using IteRator cursor-----");
        
        Iterator itr = v.iterator();
        while(itr.hasNext()) //true
        {
        System.out.println(itr.next());
        }
        
        System.out.println("----Print Vector data using ListIteRator cursor-----");
        ListIterator litr = v.listIterator();
        while(litr.hasNext())
        {
        System.out.println(litr.next());
        }
        System.out.println("----Print Vector data using Enumeration cursor-----");
        Enumeration enu = v.elements();
        while(enu.hasMoreElements())
        {
        System.out.println(enu.nextElement());
        }

	}
	
}
