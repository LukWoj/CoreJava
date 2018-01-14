package boxesforfruits.generics;

public class Main {

	public static void main(String[] args) {
		
		FruitBox fruiBox = new FruitBox(new Orange());
		Orange fruit1 = (Orange) fruiBox.getfruit();
		System.out.println(fruit1);
	}

}
