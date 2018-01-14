package test;

public class Numbers2 {

	private int[] numbers;

	public Numbers2() {
		numbers = new int[10];
	}

	public void add(int index, int number) throws ArrayIndexOutOfBoundsException {
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException("Indeks musi by� wi�kszy od 0!");
		} else if (index >= numbers.length) {
			throw new ArrayIndexOutOfBoundsException("Indeks musi by� mniejszy od rozmiaru tablicy: " + numbers.length);
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
		Numbers2 num = new Numbers2();
		num.add(-120, 5);
		for (int i = 0; i < num.numbers.length; i++) {
			System.out.println(num.numbers[i]);
		}
		
        // wszystko ok
        num.add(3, 5);
        // wszystko ok, pobieramy wcze�niej dodan� liczb�
        int number3 = num.get(3);
        System.out.println(number3);
        // b��dy indeks, wygenerowanie wyj�tku
        num.add(20, 20);
        // b��dy indeks, gdyby kod dotar� do tego miejsca
        // r�wnie� wygenerowany zosta�by wyj�tek
        int number20 = num.get(20);
        System.out.println(number20);

	}
}
