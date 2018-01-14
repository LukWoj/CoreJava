import java.io.*;
import java.util.*;


public class Main {
	public static final String stop = "-";
	
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String newWord= "";
		System.out.println("Podaj ścieżkę do pliku wejściowego");
		
		
		FileWriter filewriter = null;
		
		try {
			filewriter = new FileWriter(in.nextLine());
			System.out.println("Podaj zawartość pliku");
		while(true) {
			filewriter.write(in.nextLine());
			
			if (in.nextLine().equals(stop)) {
				break;
			}
				}
			}
			finally {
				if(filewriter != null) {
					filewriter.close();
				}
			}
	}
}