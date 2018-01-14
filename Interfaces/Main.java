import java.util.*;


public class Main {

	public static void main(String[] args) {
		Figure[] figures = new Figure[3];  
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj promień koła");
		
		figures[0] = new Circle(sc.nextDouble());
		System.out.println(figures[0].getPerimeter());
		System.out.println(figures[0].getArea());
		System.out.println(figures[0].getName());
	}

}
