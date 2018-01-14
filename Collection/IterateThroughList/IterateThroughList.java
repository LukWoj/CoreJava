package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateThroughList {
 
	public static void main(String[] argv) {
 
		// create list
		List<String> listForIter = new ArrayList<String>();
		listForIter.add("eBay");
		listForIter.add("Paypal");
		listForIter.add("Google");
		listForIter.add("Yahoo");
		
		for (int i = 0; i < listForIter.size(); i++) {
			
			System.out.println(listForIter.get(i));
		}
		
		for (String getElement : listForIter) {
			System.out.println(getElement);
		}
		
		System.out.println("Iterator");
		Iterator<String> iterator = listForIter.iterator();
		for (int i = 0; i < listForIter.size(); i++) {
			System.out.println(listForIter.get(i));
		}
		// iterate via "while loop"
		System.out.println("\n==> While Loop Example....");
		int i = 0;
		while (i < listForIter.size()) {
			System.out.println(listForIter.get(i));
			i++;
		}
		
		System.out.println("\n==> collection stream() util....");
		listForIter.forEach((temp) -> {
			System.out.println(temp);
		});
		
		
		
	}
}