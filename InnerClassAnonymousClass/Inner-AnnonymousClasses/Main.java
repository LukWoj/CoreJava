
public class Main
{

	public static void main(String[] args)
	{
		KlasaA klasaA = new KlasaA();
		IKlasy klasaB = klasaA.zwr�cInstancjeKlasyB();
		IKlasy klasaC = klasaA.zwr�cInstancjeKlasyC();
		
		klasaB.wyswietlNapis();
		klasaC.wyswietlNapis();
		
	}

}
