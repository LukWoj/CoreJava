/**
 *  www.samouczekprogramisty.pl/
 *  klasyWewnetrzneIanonimowe/exercise 2
 *  @author £ukasz (archyzone)
 */

/*Zadanie to będzie wymagało dodatkowej lektury na temat interfejsu Comparator ze standardowej biblioteki Javy. 
Pobierz od użytkownika 5 wyrazów, zapisz je w List<String>. Użyj metody Collections.sort, przekazując jako argumenty 
listę oraz klasę anonimową, która posortuje ją na podstawie długości wyrazów (najkrótsze wyrazy powinny być pierwsze). 
Do sprawdzenia długości słowa możesz 
użyć metody String.length. Wyświetl zawartość listy przed i po sortowaniu.*/

import java.util.*;

public class Exercise2
{
	public static void main(String[] args)
	{
		List<String> wordTable = new LinkedList<>();

		Scanner in = new Scanner(System.in);
		System.out.println("Podaj piec wyrazów");
		for (int i = 1; i < 6; i++)
		{
			System.out.println("wyraz " + i + ":");
			String word = in.nextLine();
			wordTable.add(word);
		}

		System.out.println("Elementy przed sortowaniem");
		for (String word : wordTable)
		{
			System.out.println(word);
		}

		Collections.sort(wordTable, new Comparator<String>()//klasa wewnetrzna anonimowa
		{
			@Override
			public int compare(String str1, String str2)
			{
				int word = str1.length() - str2.length();
				return word;
			}
		});

		in.close();

		System.out.println("Po sortowaniu");
		for (String word : wordTable)
		{
			System.out.println(word);
		}
	}
}