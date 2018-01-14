import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test
{
	public static void main(String[] args)
	{
		Map<String, String> sampleMap = new HashMap<>();
		sampleMap.put("Marek", "Magda");
		sampleMap.put("Marcin", "Adela");
		
		for (String value: sampleMap.values()) {
			System.out.println(value);
		}
		
		for (String keys : sampleMap.keySet())
		{
			String value =  sampleMap.get(keys);
			System.out.println(keys + ": " + value );
			
		}
		
		for (Map.Entry<String, String> entry: sampleMap.entrySet()) {
			String keys = entry.getKey();
			String values = entry.getValue();
			System.out.println(keys + ": " + values );
					}
	}
}
