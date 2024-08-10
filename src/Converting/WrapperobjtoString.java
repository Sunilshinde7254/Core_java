package Converting;

public class WrapperobjtoString 
{
	public static void main(String[] args) 
	{
      Integer intergobj = 100;
      Double doublobj = 45.23;
      Boolean boolenobj = true;
      
      String intstring = intergobj.toString();
      String doubString = doublobj.toString();
      String boolstring = boolenobj.toString();
      
      
      System.out.println("Integer as a String :"+intstring);
      System.out.println("Double As a String :"+doubString);
      System.out.println("Boolen As String :"+boolstring);
      
       
	}
}
