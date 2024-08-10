package Loops;

public class Example9_while 
{
	public static void main(String[] args) 
	{
		int count = 1; 
        int limit = 20; // You can change the limit based on your requirement

        while (count <= limit) {
            if (count % 2 == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
	}
}
