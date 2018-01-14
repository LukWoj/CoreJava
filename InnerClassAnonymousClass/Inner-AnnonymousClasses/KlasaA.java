import java.util.*;

public class KlasaA {
	private class KlasaC implements IKlasy { // klasa wewnetrzna
		
		public void wyswietlNapis()  {
			System.out.println("Klasa C wewnatrz klasy A");
		}
		
	}
	
		public IKlasy zwrócInstancjeKlasyC() {//metoda ktora dobiera sie do klasy C
			return new KlasaC();
		}
		
		public IKlasy zwrócInstancjeKlasyB() {
			return new KlasaB() {
				public void wyswietlNapis() {
					System.out.println("Klasa anonimowa B wewnatrz klasyA");
				}		
		};

	}
	
}
