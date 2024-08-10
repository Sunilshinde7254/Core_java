package Opps_Inheritance;

public class Whatsapp3 extends Wahtsapp2
{
	void Videocall()
	{
		System.out.println("Videocall");
	}

	public static void main(String[] args) {
		Whatsapp3 w3 = new Whatsapp3();
		w3.textedit();
		w3.audiocall();
		w3.Videocall();
		
	}
}
