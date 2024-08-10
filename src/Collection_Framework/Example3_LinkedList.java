package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_LinkedList 
{
 public static void main(String[] args) 
 {
	 LinkedList link = new LinkedList<>();
	 link.add(100); //1
	 link.add(65.5f); //2
	 link.add('A'); //3
	 link.add(null); //4
	 link.add(100); //5
	 link.add(null); //6
	 
	 System.out.println(link);
	 System.out.println(link.size());
	 System.out.println(link.get(1)); //100
	 System.out.println(link.contains("abc")); 
	 
	 link.set(3, 'B');
	 System.out.println(link);
	 
	 System.out.println("---print data using for loop----");
	 for(int i=0; i<=link.size()-1; i++)
	 {
	 System.out.println(link.get(i));
	 }
	 
	 System.out.println("---print data using foreach loop----");
	 for(Object s1:link)
	 {
	 System.out.println(s1);
	 }
	 
	 System.out.println("---print data using IteRator cursor----");
	 Iterator itr = link.iterator();
	 while(itr.hasNext())
	 {
	 System.out.println(itr.next());
	 }
	 System.out.println("---print data using ListIteRator cursor----");
	 ListIterator litr = link.listIterator();
	 while(litr.hasNext())
	 {
	 System.out.println(litr.next());
	 }

}
}
