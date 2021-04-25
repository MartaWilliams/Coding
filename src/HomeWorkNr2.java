import java.util.Scanner;

public class HomeWorkNr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj. Podaj proszę pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.println("Ppodaj proszę drugą liczbę ");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;

        System.out.println("a > b: " + (firstNumber > secondNumber));
        System.out.println("a >= b: " + (firstNumber >= secondNumber));
        System.out.println("a < b: " + (firstNumber < secondNumber));
        System.out.println("a <= b: " + (firstNumber <= secondNumber));
        System.out.println("a = b: " + (firstNumber == secondNumber));
        System.out.println("a =/ b: " + (firstNumber != secondNumber));
    }
}
