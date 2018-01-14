
public class ArrayFactory
{
	private static int number;

	public ArrayFactory(int number) {
		this.number = number;
	}
	
	public int[] oneDimension (int number) {
		return new int[number];
	}
	
	public static int[][] twoDimensions () {
		int[][] array = new int[number][];
		for (int i = 0; i < number; i++) {
			array[i] = new int[number];
		}
		return array;
	}

	public static void reverseNumber (int number) {
		while (number > 0) {
			System.out.println(number);
			number--;
		}
	}

	public static int[][] macierzJednostkowa(int number) {
		int[][] matrix = twoDimensions();
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				 if (i == j) {
	                    matrix[i][j] = 1;
	                }
	                else {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	return matrix;
		
	}
	
	public static void getMatrix(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			boolean isLastOne = i == array.length - 1;
			if ( isLastOne == true) {
				System.out.print(array[i]);
			} 
			else {
				System.out.print(array[i]);
				System.out.print(",");
			}
			
		}
		
		
		
		System.out.print("]");

		
	}
}



	