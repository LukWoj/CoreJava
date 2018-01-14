import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner inPath = new Scanner(System.in);
		
		System.out.println("podaj Ścieżkę do pliku");
		String path = inPath.nextLine();
		
		System.out.println("Podaj dzień urodzenia");
		int day = inPath.nextInt();
		
		System.out.println("Podaj miesiąc urodzenia");
		int month = inPath.nextInt();
		
		System.out.println("Podaj rok urodzenia");
		int year = inPath.nextInt();
		
		DataOutputStream binaryWrite = null;
		
		try { 
			binaryWrite = new DataOutputStream(new FileOutputStream(path));
			binaryWrite.writeInt(day);
			binaryWrite.writeInt(month);
			binaryWrite.writeInt(year);
		}
		
		finally {
			if(binaryWrite != null) {
				binaryWrite.close();
			}
		}
	}

}
