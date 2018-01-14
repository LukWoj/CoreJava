
public class Main
{

	public static void main(String[] args)
	{
		KlasaA klasaA = new KlasaA();
		IKlasy klasaB = klasaA.zwrócInstancjeKlasyB();
		IKlasy klasaC = klasaA.zwrócInstancjeKlasyC();
		
		klasaB.wyswietlNapis();
		klasaC.wyswietlNapis();
		
	}

}
