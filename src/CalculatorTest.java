import java.util.Scanner;

public class CalculatorTest {

    //mapisz program który prosi uzytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj. Podaj proszę pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Ppodaj proszę drugą liczbę ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();


        int addition = calculator.add(firstNumber,secondNumber);
        System.out.println("Suma tych liczb wynosi: " + addition);
        int subtraction = calculator.sub(firstNumber,secondNumber);
        System.out.println("Różnica tych licz wybosi: " + subtraction);
        int multiplication = calculator.mult(firstNumber, secondNumber);
        System.out.println("Iloczyn tych liczb wynosi: " + multiplication);
        int division = calculator.div(firstNumber,secondNumber);
        System.out.println("Iloraz tych licz wynosi: " + division);
        int modulo = calculator.mod(firstNumber, secondNumber);
        System.out.println("Modulo tych liczb wynosi: " + modulo);
    }
}
