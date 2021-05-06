
/*zapytaj użytkownika o wiek.
W przypadku jeśli ma mniej niż 18 wypisz na ekranie informację ze nie możesz kupić alkoholu.
Gdy ma więcej niż 18 lat, podziękuje za zakupy*/


import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj. Podaj proszę swój wiek");
        int age = scanner.nextInt();
        if (age <18 && age >=0) { //pamiętaj o zerze!
            System.out.println("Nie sprzedajemy alkoholu nieletnim");
        } else if (age < 0) {
            System.out.println("Wprowadź poprawną wartość"); // pamiętaj o liczbach ujemnych !!
        } else {
            System.out.println("Dziękujemy za zakupy");
        }


    }
}
