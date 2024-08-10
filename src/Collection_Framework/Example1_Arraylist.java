package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.JList;

public class Example1_Arraylist 
{
	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList<>();
		a1.add("Sunil");
		a1.add(101);
		a1.add(78.98);
		a1.add(null);
		a1.add('A');
		a1.add(101);
		a1.add(null);
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.get(4));
		System.out.println(a1.size());
		a1.contains(a1.contains("Sunil"));

		System.out.println(a1);
		System.out.println(a1.get(3));
		System.out.println(a1.size()); //7
		System.out.println(a1.contains("Rahul"));
		a1.set(0, "RAHUL"); //update data
		System.out.println(a1);
		a1.add(3, "Mahesh"); //add data in between arraylist --> right shift
		System.out.println(a1);
		a1.remove(3); //remove data in between arraylist -> left shift 
		System.out.println(a1);
		System.out.println("----Print Arraylist data using for loop-----");
		for(int i=0; i<=a1.size()-1; i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("----Print Arraylist data using foreach loop-----");
		for(Object s1: a1)
		{
			System.out.println(s1);
		}
		System.out.println("----Print Arraylist data using IteRator cursor-----");
		Iterator itr = a1.iterator();
		while(itr.hasNext()) //true
		{
			System.out.println(itr.next());
		}
		System.out.println("----Print Arraylist data using ListIteRator cursor-----");

		ListIterator litr = a1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		int [] ar = {50,30,20,70,60,70,75}; //size=4
				//print array data using foreach loop
		for(Object s1:ar)
		{
			System.out.println(s1);
		}
		//print specific index data from //0 to 3
		int index=0;
		for(Object s1:ar)
		{
			if(index<4)
			{
				System.out.println(s1);
			}
			index++;
		}

	}

}
