package Java_Collections;

import java.util.ArrayList;

public class ArrayListEx7_Contains
{
	public static void main(String[] args) 
	{
        EMP e1 = new EMP(111, "Sunil");
        EMP e2 = new EMP(222, "Anil");
        EMP e3 = new EMP(333, "Anuja");
        EMP e4 = new EMP(444, "Tejal");
        
        ArrayList<EMP> a1 = new ArrayList<EMP>();
        a1.add(e1);
        a1.add(e2);
        
        ArrayList<EMP> a2 = new ArrayList<EMP>();
        a2.addAll(a1);
        a2.add(e3);
        a2.add(e4);
        a2.remove(e1);
        
        System.out.println(a2.contains(e1));
        System.out.println(a2.containsAll(a1));
        
        for(EMP e :a2)
        {
        	System.out.println(e.eid +""+e.ename);
        }
        
        
}
}
