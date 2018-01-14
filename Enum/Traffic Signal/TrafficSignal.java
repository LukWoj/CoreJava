
public enum TrafficSignal
{
	RED("stop"), GREEN("start"), ORANGE("slow down");

	private String action;

	public String getAction()
	{
		return this.action;
	}

	private TrafficSignal(String action)
	{
		this.action = action;
	}

}
