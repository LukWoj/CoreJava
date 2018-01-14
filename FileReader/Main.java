import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException  {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj ścieżkę do pliku wejściowego");
	
		BufferedReader fileReader = null;
		
		try {
			FileReader openPath = new FileReader(in.nextLine());
			fileReader = new BufferedReader(openPath);
			
		while(true) {
			String readLine = fileReader.readLine();
			if (readLine == null) {
				break;
				}
			System.out.println(readLine);
		}
	}
			finally {
				if (fileReader != null) {
					fileReader.close();
				}
			}
	}
	
}