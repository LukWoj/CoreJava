package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers3 {
	private int[] numbers; // zmienna rferencyjna typu tablicowego

	public Numbers3() {
		numbers = new int[10];
	}

	public void addTabElem(int index, int param) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException("Indeks tablicy musi byæ wiekszy od 0 mniejszy od 10");
		}
		numbers[index] = param;

	}

	private int getTabIndexElem(int index) {
		return numbers[index];
	}

	public static void main(String[] args) {

		Numbers3 num = new Numbers3();

		try {
			num.addTabElem(120, 5);
			for (int i = 0; i < num.numbers.length; i++) {
				System.out.println(num.numbers[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
