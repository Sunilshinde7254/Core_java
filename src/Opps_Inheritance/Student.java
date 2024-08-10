package Opps_Inheritance;

public class Student 
{
   int Sid;
   int Smark;
   String Sname;
   static String collage_City= " Pune ";
   
   
   Student(int id,int mark,String name)
   {

	   Sid = id;
	   Smark=mark;
	   Sname=name;
	  
   }
   void studentinfo()
   {
	   System.out.println("Student Id:"+Sid);
	   System.out.println("Student Mark:"+Smark);
	   System.out.println("Student Name:"+Sname);
	   
	   
   }
}
