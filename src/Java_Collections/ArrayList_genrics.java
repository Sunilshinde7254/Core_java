package Java_Collections;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthTableUI;

public class ArrayList_genrics
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
        
        
        // use Genrics provide the type safety to collection
        ArrayList<EMP> emps = new ArrayList<EMP>();
        emps.add(new EMP (111,"SUNIL"));
        emps.add(new EMP(222,"ANIL"));
        
        for(EMP e :emps)
        {
        	System.out.println(e.eid +" " +e.ename );
        	
        	EMP e1 = emps.get(1);
        	System.out.println(e1.eid +""+e1.ename);
        }
	}

	
}
