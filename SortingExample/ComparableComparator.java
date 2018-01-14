import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Komparator implements Comparator<Czlowiek> {

	@Override
	public int compare(Czlowiek o1, Czlowiek o2)
	{
		int plecKomparator = o1.getPlec() - o2.getPlec();
		if (plecKomparator == 0)
		{
			return plecKomparator;
		} else
		{
			return o1.compareTo(o2);
		}
		
	}
	
}
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
	
	  public char getPlec() {
	        return plec;
	    }

	@Override
	public String toString()
	{
		return nazwisko + " " + imie + " (" + plec + ")";
	}

	@Override
	public int compareTo(Czlowiek o)
	{
		int surmaneCompare = this.nazwisko.compareTo(o.nazwisko);
		if (surmaneCompare == 0)
		{
			return this.imie.compareTo(imie);
		} else
		{
			return surmaneCompare;
		}

	}
	


}

class ComparableComparator
{

	public static void main(String[] args)
	{

		List<Czlowiek> ludzie = new ArrayList<Czlowiek>();
		ludzie.add(new Czlowiek('K', "Asia", "Wczorajsza"));
		ludzie.add(new Czlowiek('M', "Marcin", "Nikczemny"));
		ludzie.add(new Czlowiek('M', "Slawek", "Abacki"));
		ludzie.add(new Czlowiek('K', "Kasia", "Borowik"));
		ludzie.add(new Czlowiek('K', "Dorota", "Borowik"));
		ludzie.add(new Czlowiek('M', "Tomek", "Daszek"));
		ludzie.add(new Czlowiek('K', "Ania", "Daszek"));

		Komparator comp = new Komparator();
		Collections.sort(ludzie, comp);
		System.out.println("Sorted List");
		for (Czlowiek czlowiek : ludzie)
		{
			System.out.println(czlowiek);
		}
	}

}

