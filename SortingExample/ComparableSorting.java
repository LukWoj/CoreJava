import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Czlowiek implements Comparable<Czlowiek>
{

	private char plec;
	private String imie;
	private String nazwisko;

	public Czlowiek(char plec, String imie, String nazwisko)
	{
		this.plec = plec;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString()
	{
		return nazwisko + " " + imie + " (" + plec + ")";
	}

	/*
	 * public int compareTo(Czlowiek o) {
	 * 
	 * return this.nazwisko.compareTo(o.nazwisko); } // sortowanie po nazwisku
	 */
	public int compareTo(Czlowiek o)
	{
		int nazwiskoComparison = this.nazwisko.compareTo(o.nazwisko);
		if (nazwiskoComparison == 0)
		{
			return this.imie.compareTo(o.imie);
		} else
		{
			return this.nazwisko.compareTo(o.nazwisko);
		} // sortowanie po nazwisku a potem imieniu

	}

}

class ComparableSorting
{

	public static void main(String[] args)
	{

		List<Czlowiek> ludzie = new ArrayList<>();
		ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
		ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
		ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
		ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
		ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
		ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
		ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

		Collections.sort(ludzie);
		System.out.println("Sorted List");
		for (Czlowiek czlowiek : ludzie)
		{
			System.out.println(czlowiek);
		}
	}

}

