package Interfaces;

public interface CommonFunction 
{
 public static void getexceldata()
 {  
	 getExcelPath();           // private method directly call in main method is not possible 
	                           // thats wahy call here and access data 
	 System.out.println("Code to fetch data from excel");
 }
 private static void getExcelPath() //private method in interface
 { 
 System.out.println("code to get Excel Path");
 }
}
