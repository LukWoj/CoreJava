import java.util.Arrays;
import java.util.Comparator;

class Pracownik
{
	private String imie;
	private String nazwisko;
	private double wyplata;

	public Pracownik(String imie, String nazwisko, double wyplata)
	{
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wyplata = wyplata;
	}

	String getImie()
	{
		return imie;
	}

	String getNazwisko()
	{
		return nazwisko;
	}

	double getWyplata()
	{
		return wyplata;
	}

	public String toString()
	{
		return "Imię: " + imie + ", Nazwisko: " + nazwisko + ", Wypłata: " + wyplata;
	}
}

class Komparator implements Comparator<Pracownik>
{

	@Override
	public int compare(Pracownik p1, Pracownik p2)
	{
		if (p2 == null)
			return -1;
		if (p1.getWyplata() > p2.getWyplata())
			return 1;
		else if (p1.getWyplata() < p2.getWyplata())
			return -1;
		else
			return 0;
	}
}

public class Comparator
{
	public static void main(String args[])
	{
		// Tworzymy kilku pracowników
		Pracownik krzysiek = new Pracownik("Krzysiek", "Piotrowicz", 2000);
		Pracownik piotrek = new Pracownik("Piotrek", "Wolny", 3000);
		Pracownik kasia = new Pracownik("Kasia", "Krotwicka", 2500);
		Pracownik wlodek = new Pracownik("Wlodek", "Zieba", 2300);

		// umieszczamy naszych pracowników w tablicy
		Pracownik[] prac = { krzysiek, piotrek, kasia, wlodek };
		// tworzymy obiekt komparatora, który wcześniej napisaliśmy
		Komparator komp = new Komparator();
		// sortujemy tablicę przy użyciu komparatora
		Arrays.sort(prac, komp);
		// wyświetlamy posortowaną tablicę
		wyswietl(prac);
	}

	
	public static void wyswietl(Pracownik[] prac)
	{
		for (Pracownik p : prac)
			System.out.println(p);
	}
}
