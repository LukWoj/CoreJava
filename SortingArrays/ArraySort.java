package sorting.arrays;

import java.util.*;

/**
 * Sortowanie tablic
 * @author £ukasz(archyzone)
 */
public class ArraySort {

	public static void main(String[] args) {

		String[] fruits = { "banana", "orange", "apple", "pear" };

		Arrays.sort(fruits);

		System.out.println("Sorted fruits:");
		for (String f : fruits) {
			System.out.println(f);
		}
	}
}
