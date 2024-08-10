package Loops;

import java.util.Scanner;

public class Example10_whilediff 
{
	public static void main(String[] args) 
	{
       System.out.println(" Enter the number");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       while(num<=100)
       {
    	   System.out.println(num);
    	   num++;
   
       }
      
	}
}
