package Abstract_class;

abstract class Example7_sub2 extends Example7_sub1
{

	@Override
	double totalbill(String pname, double pcost, int puqantity) 
	{
		System.out.println("Product Name:"+pname +" "+"Product Cost"+pcost+" Product Quantity"+puqantity);
		return 0;
	}

	
		
	

}
