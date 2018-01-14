
public class TshirtShop
{
	public static void main(String[] args)
	{
		System.out.println(" Dostepne rozmiary T-SHIRTÓW : ");
		for (Size s : Size.values())
		{
			System.out.println(s.getTshirtDescription());
		}
		Tshirt tShirt1 = new Tshirt();
		tShirt1.setSize(Size.SMALL);
		System.out.println("Wybrales t-shirt: ");
		System.out.println(tShirt1.getSize());
		System.out.println(tShirt1.getSize().getTshirtDescription());
		tShirt1.setSize(Size.valueOf("a"));
	}
}
