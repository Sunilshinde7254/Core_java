package Java_Collections;

import java.util.ArrayList;

public class ArrayList8_removeall 
{ 
	public static void main(String[] args) 
	{
		 ArrayList<EMP> a1 = new ArrayList<EMP>();
		 
		 a1.add(new EMP(111,"Sunil"));
		 a1.add(new EMP(222,"Anil"));
		 
		 ArrayList<EMP> a2 = new ArrayList<EMP>(a1);
		 a2.add(new EMP (333,"Anuja"));
		 a2.add(new EMP(444,"Tejal"));
		 
		 a2.removeAll(a2);
		 a2.retainAll(a1);
		
		 for(EMP e:a2)
		 {
			 System.out.println(e);
		 }
	    System.out.println("Operations are complted");
	}

}
