
public class Tshirt
{
	private TshirtSize size;
	private String manufacturer;
	
	public Tshirt(TshirtSize size, String manufacturer)
	{
		super();
		this.size = size;
		this.manufacturer = manufacturer;
	} 
	
	public static void main(String[] args)
	{
		Tshirt tshirt_1 = new Tshirt(TshirtSize.S, "Dayton");
		System.out.println("Rozmiar: " + tshirt_1.size + " producent: " + tshirt_1.manufacturer );
		
		switch (tshirt_1.size)
		{
		case S:
			System.out.println("Wybrales rozm. S");
			break;
		case M:
			System.out.println("Wybrales rozm. S");
			break;
		}
	}
	
	
	
	

}
