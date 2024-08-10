package Java_Collections;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthTableUI;

public class ArrayList1 
{
	public static void main(String[] args) 
	{
        ArrayList objs = new ArrayList();
        objs.add(new EMP(111, "Sunil"));
        objs.add(new Student(123, "Anil"));
        objs.add(null);
        
        for(Object o :objs)
        {
        	if(o instanceof EMP)
        	{
        		EMP e = (EMP) o;
        		System.out.println(e.eid +""+e.ename );
        	}
        	if(o instanceof Student)
        	{
        		Student s = (Student) o;
        		System.out.println(s.sid +""+s.sname);
        	}
        	if(o==null)
        	{
        		System.out.println(o);
        	}
        }
        
	}

	
}
