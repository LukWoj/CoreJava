import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double a = 0;
        double b = 0;
        String operator = null;
        boolean readComplete = false;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = input.nextDouble();
                input.nextLine();
                System.out.println("Podaj operator arytmetyczny (+, -, * lub /): ");
                operator = input.nextLine();
                System.out.println("Podaj drugą liczbę: ");
                b = input.nextDouble();
                readComplete = true;

            } catch (InputMismatchException ex) {
                System.out.println("Niepoprawne dane wpisz ponownie");
                input.nextLine();

            }

            Calculator calc = new Calculator();
            double result = 0;
            boolean calculationComplete = false;
            try {
                result = calc.calculate(a, b, operator);
                calculationComplete = true;
            } catch (ArithmeticException | UnknownOperatorException ex) {
                System.err.println(ex.getMessage());
            }
            if(calculationComplete) {
                System.out.println(a + operator + b + " = " + result);
            } else {
                System.out.println("Nie można było obliczyć wyniku wyrażenia " + a + operator + b);
            }
            input.close();
        }
    }
}