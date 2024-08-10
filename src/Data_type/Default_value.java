package Data_type;

import java.util.jar.Attributes.Name;

public class Default_value 
{    
	int a;
	char name;
	byte b;
	long num;
	short num2;
	float num3;
	double num4;
	boolean flase;
	String nae;
public static void main(String[] args) 
{
	Default_value df = new Default_value();

	System.out.println("Char: "+df.name);  //  Char default value - single space 
	System.out.println("int: "+df.a);     // int default value - 0
	System.out.println("byte: "+df.b);     // byte default value - 0
	System.out.println("Long: "+df.num);   // long defalut value - 0
	System.out.println("Short: "+df.num2);  // Short default value - 0
	System.out.println("Float: "+df.num3);  // Folat default value - 0.0
	System.out.println("double: "+df.num4);  // double default value - 0.0
	System.out.println("boolean: "+df.flase); // boolean default value - false
	System.out.println(df.nae);


}
}
