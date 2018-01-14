
public class TrafficTest
{

	public static void main(String[] args)
	{
		TrafficSignal signal_red = TrafficSignal.valueOf("RED");
		System.out.println("signal type: " + signal_red.name() + " action: " + signal_red.getAction());

		TrafficSignal signal_green = TrafficSignal.valueOf("GREEN");
		System.out.println("signal type: " + signal_green.name() + " action: " + signal_green.getAction());

		// valueOf will throw IllegalArgumentException
		signal_green = TrafficSignal.valueOf("Green");

	}

}
