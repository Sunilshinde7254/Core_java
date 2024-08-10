package Array;

public class Student_Main 
{
	public static void main(String[] args) 
	{
        Student [] arr= new Student[5];
        arr[0] = new Student(1, "Sunil", 78);
        arr[1] = new Student(2, "Anil", 98);
        arr[2] = new Student(3, "Tejal", 88);
        
        for(Student ss:arr)
        {
        	if(ss==null)
        	{
        		System.out.println(ss);
        	}
        	else
        	{
        		System.out.println(ss.sid+" "+ss.sname+" "+ss.smarks);
        	}
        	
        }
        
        
	}
}
