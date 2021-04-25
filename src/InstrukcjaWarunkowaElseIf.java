public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        int number = 11;

        if (number == 0) {
            System.out.println("Liczba równa zero");
        } else if (number >10) {
            System.out.println("Numer większt od 10");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}

// jeśli sprawdzamy warunki i pirwszy z listy zostanie spełniony pozostałe nie sa sprawdzane
// dlatego najważniejsze warunki powinny być umieszczane na początku listy