
public enum Pizza
{

	MARGHERITA(true, true, false, false), CAPRICIOSA(true, true, true, false), PROSCIUTTO(true, true, false, true);

	private Pizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham)
	{
		this.tomatoSauce = tomatoSauce;
		this.cheese = cheese;
		this.mushrooms = mushrooms;
		this.ham = ham;
	}

	private boolean tomatoSauce;
	private boolean mushrooms;
	private boolean ham;
	private boolean cheese;

	public boolean getCheese()
	{
		return cheese;
	}

	public boolean getMushrooms()
	{
		return mushrooms;
	}

	public boolean getHam()
	{
		return ham;
	}

	public boolean getTomatoSauce()
	{
		return tomatoSauce;
	}

	public String toString()
	{
		String pizzaDesc = name() + " (";
		if (tomatoSauce)
		{
			pizzaDesc = pizzaDesc + "sos pomidorowy";
		}
		if (cheese)
		{
			pizzaDesc = pizzaDesc + ", ser";
		}
		if (mushrooms)
		{
			pizzaDesc = pizzaDesc + ", pieczarki";
		}
		if (ham)
		{
			pizzaDesc = pizzaDesc + ", szynka";
		}
		pizzaDesc = pizzaDesc + ")";
		return pizzaDesc;
	}

}
