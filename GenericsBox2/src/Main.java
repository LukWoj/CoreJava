

public class Main {

	public static void main(String[] args) {
		
		BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<Apple>(new Apple());
		Apple apple1 = appleBox.getFruit();
		System.out.println(apple1.getClass());
		
		BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<Orange>(new Orange());
		Orange orange1 = orangeBox.getFruit();
		System.out.println(orange1.getClass());
		
		Pair< BoxOnSteroids<Orange>, BoxOnSteroids<Apple> > pairOfBoxes = new Pair<>(
		        new BoxOnSteroids<>(new Orange()),
		        new BoxOnSteroids<>(new Apple())
		);
		
		BoxOnSteroids boxWithoutType = new BoxOnSteroids(new Apple());
		BoxOnSteroids<Apple> boxWithApple = boxWithoutType;
		BoxOnSteroids<Orange> boxWithOrange = boxWithoutType;
		Apple apple = boxWithApple.getFruit();
		Orange orange = boxWithOrange.getFruit(); // ClassCastException
	}

}

