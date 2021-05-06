public class PetlaDoWhile {
    public static void main(String[] args) {
        int number = 5;
        do {       //pętla while najpierw wykonuje blok, a dopiero potem sprawdza warunek
            System.out.println("Moja wartość to: " + number + " i jestem mniejsza od 20");
            number++;
        } while (number<20);

        }
    }

