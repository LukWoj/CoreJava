package sorting.ArrayList;

import java.util.*;

public class ArrayListSort
{

	public static void main(String[] args)
	{

		List<String> fruits = new ArrayList<String>();

		fruits.add("pear");
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");

		Collections.sort(fruits);

		System.out.println("Sorted fruits:");
		for (String f : fruits)
		{
			System.out.println(f);
		}

	}

}
