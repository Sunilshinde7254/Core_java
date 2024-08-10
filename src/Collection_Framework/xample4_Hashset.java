package Collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class xample4_Hashset 
{
	public static void main(String[] args) 
	{
          HashSet hset = new HashSet();
          hset.add("Sunil");
          hset.add(100);
          hset.add(65.5);
          hset.add('A');
          hset.add(null);
          hset.add(100);
          hset.add(null);
          
          System.out.println(hset);
          System.out.println(hset.size());
          System.out.println(hset.contains(1000));
          hset.remove('A');
          System.out.println(hset);
          
          System.out.println(" ---------Print data using loop");
          for(Object sh:hset)
          {
        	  System.out.println(sh);
          }
          System.out.println("------Print data using Itrator--------");
          
          Iterator itr = hset.iterator();
          while(itr.hasNext())
          {
        	  System.out.println(itr.next());
          }

          
	}
}
