package equals.human.samouczekprogramisty.pl;

public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("Jan", "Kowalski", "850223000000");
        Human human2 = new Human("Jan", "Kowalski", "891213000000");
        Human human3 = new Human("Jan", "Kowalski", "850223000000");
        
        System.out.println(human1 + " == " + human2 + " " + human1.equals(human2));
        System.out.println(human2 + " == " + human3 + " " + human2.equals(human3));
        System.out.println(human1 + " == " + human3 + " " + human1.equals(human3));
	}

}
