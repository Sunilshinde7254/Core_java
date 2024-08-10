package Constructor;

public class Example2_con 
{
	int num  ;
	String name ;
	int marks ;
	public Example2_con(int num , String name , int marks) 
	{
		this.num = num;
		this.name = name;
		this.marks = marks;
	}
	void show()
	{
		System.out.println(num);
		System.out.println(name);
		System.out.println(marks);
	}
	public static void main(String[] args) 
	{
        Example2_con ex = new Example2_con(1, "Sunil", 89);
        ex.show();
	}
}
