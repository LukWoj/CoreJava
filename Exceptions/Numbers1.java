package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers1 {
	private int[] numbers;

	public Numbers1() {
		numbers = new int[10];
	}

	public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		numbers[index] = number;
	}

	public int get(int index) throws ArrayIndexOutOfBoundsException {
		if (index < 0 || index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return numbers[index];
	}

	public static void main(String[] args) {
		Numbers1 num = new Numbers1();
		num.add(120, 5);
		for (int i = 0; i < num.numbers.length; i++) {
			System.out.println(num.numbers[i]);
		}
	}
}