
public enum Size
{
	SMALL("Maly"), MEDIUM("Sredni"), LARGE("Duzy");

	private String tshirtDescription;

	private Size(String size)
	{
		tshirtDescription = size;
	}

	public String getTshirtDescription()
	{
		return tshirtDescription;
	}

}