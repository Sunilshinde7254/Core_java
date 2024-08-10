package Opps_Inheritance;

public class Person 
{
	
    int pid;
    int page;
    String pname;
    
    Person(int id, int age,String name)
    {
		pid=id;
		page= age;
		pname=name;
	}
    void info()
    {  
    	
    	if(page>18)
    	{
    		System.out.println(" Person Id :"+pid+" Person name:"+pname+" Person Age :"+page+" this person is eligible for voting");
    	}
    	else
    	{
    		System.out.println(" Person Id :"+pid+" Person name:"+pname+" Person Age :"+page+" this person is not eligible for voting");
    	}
    	
    }
}
