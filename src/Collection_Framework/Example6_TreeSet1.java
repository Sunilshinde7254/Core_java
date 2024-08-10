package Collection_Framework;

import java.util.Iterator;
import java.util.TreeSet;

public class Example6_TreeSet1 
{
	public static void main(String[] args) 
	{
        TreeSet tset = new TreeSet();
        tset.add(400);
        tset.add(200);
        tset.add(100);
        tset.add(700);
        tset.add(500);
        tset.add(600);
        tset.add(300);
        tset.add(300);
       // tset.add(null);
        System.out.println(tset);
        System.out.println(tset.size());
        System.out.println(tset.contains(400));
        tset.remove(400);
        System.out.println(tset);
        
        System.out.println(tset.first());
        System.out.println(tset.last());
        
        tset.pollFirst();
        System.out.println(tset);
        tset.pollLast();
        System.out.println(tset);
        
        System.out.println("---Print data using for each loop");
        
        for(Object s1:tset)
        {
        	System.out.println(s1);
        }
        
        System.out.println("----Print data using Iterator cursor---");
        
        Iterator itr = tset.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
			
		}
        System.out.println("-----print data using descending iterator cursor------");
        		Iterator ditr = tset.descendingIterator();
        		while(ditr.hasNext())
        		{
        		System.out.println(ditr.next());
        		}

        
        
	}
}
