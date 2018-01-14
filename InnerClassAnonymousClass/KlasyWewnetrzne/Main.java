import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main
{

	public static void main(String[] args)
	{
		

	}

	private static void localClassInstance (String args[]) {
		class LocalClass { // lokalna
			@Override
			public String toString() {
				return "Wyœwietl argumenty metody: " + Arrays.toString(args);
			}
		}
		LocalClass localClassInstance = new LocalClass();
		System.out.println(localClassInstance);
	}
	
	private static void innerClassInstiation()
	{
		Outer outer = new Outer();//instancja klasy zewnetrznej
		Outer.InnerClass instance1 = outer.instantiate();// instancja klasy wewntrznej w wyniku wywoania metody
		Outer.InnerClass instance2 = outer.new InnerClass();// instancja klasy Innerclass
	}
	
	private static void staticInnerClassInstiation()//nie potrzebujemy instancji klasy zewnêtrznej do stworzenia instancji statycznej klasy wewnêtrznej
	{
		Outer2 outer = new Outer2();//instancja klasy zewnetrznej
		Outer2.Inner2 instance1 = outer.instantiate();// instancja klasy wewntrznej w wyniku wywoania metody
		Outer2.Inner2 instance2 = new Outer2.Inner2();// instancja klasy Innerclass
	}
	
	
	 private static void mapIterationExampe() {
	        Map<String, Integer> dayInMonths = new HashMap<>();
	        dayInMonths.put("styczen", 31);
	        dayInMonths.put("luty", 28);
	        dayInMonths.put("marzec", 31);

	        for(Map.Entry<String, Integer> entry : dayInMonths.entrySet()) {
	            System.out.println(entry.getKey() + " ma " + entry.getValue() + " dni.");
	        }
	}
	 
}
