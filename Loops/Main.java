
public class Main
{

    public static void main(String[] args) {
        String marki[] = {"Opel", "Fiat", "Mazda", "Polonez", "Syrena" };
        //getPositiveNumberFor(10);
        //getPositiveNumberWhile(10);
       // ArrayFactory.reverseNumber(100);
        ArrayFactory.macierzJednostkowa(4);
        int[] array =  {1,2,3,4};
       ArrayFactory.getMatrix(array);
        
    }

    public static void getPositiveNumberFor(int number) {
    	for(int i=0; i<=number;i++) {
    		System.out.println(i);
    	}
    }
    public static void getPositiveNumberWhile (int number) {
    	int index = 0;
    	while (index <= number) {
    		System.out.println(index++);    		
    	}
    }

    public static String reverseWord(String word) {
		
    	return word;
    	
    }
}
