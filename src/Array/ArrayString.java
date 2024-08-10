package Array;

public class ArrayString 
{
  public static void main(String[] args) 
  {
	String [] s = new String[5];
	s[0] = "Sunil";
	s[1] = "Anil";
	s[2] = "Tejal";
	for(int i =0;i<s.length;i++)
	{
		if(s[i]==null)
		{
			System.out.println(i);
		}
	}
}
}
