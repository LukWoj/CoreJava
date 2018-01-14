

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		Scanner readInput = new Scanner(System.in);
		System.out.println("Podaj œcie¿ke");
		String path = readInput.nextLine();
		int day = 0;
		int month = 0;
		int year = 0;
		DataInputStream binaryRead = null;
		
		try {
			binaryRead = new DataInputStream(new FileInputStream(path));
			day = binaryRead.readInt();
			month = binaryRead.readInt();
			year = binaryRead.readInt();
			
			System.out.println("Data urodzenia delikwenta to: " + day+"."+month+"."+year);
		} finally {
			if (binaryRead != null) {
				binaryRead.close();
			}
		}
	}

}
