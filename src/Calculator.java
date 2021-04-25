import java.util.Scanner;

public class Calculator {

    //mapisz program który prosi uzytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj. Podaj proszę pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Ppodaj proszę drugą liczbę ");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;
        System.out.println("Suma tych liczb wynosi: " + result);
        int subtraction = firstNumber - secondNumber;
        System.out.println("Różnica tych licz wybosi: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Iloczyn tych liczb wynosi: " + multiplication);
        float division = firstNumber / secondNumber;
        System.out.println("Iloraz tych licz wynosi: " + division);

    }
}
