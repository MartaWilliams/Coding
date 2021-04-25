
// Instrukcje warunkowe pozwalają nam okreslić które cześci kodu mają zostać wykonane , gdy zostanie spłeniony warunek

public class InstrukcjaWarunkowaIf {
    public static void main(String[] args) {
        float a = 4.0F;
        float b = 0; // b powinna być różna od zera
        if (b!=0) {
            System.out.println("WYnik dzielnia to: " + (a/b));
        } else {
            System.out.println("Proszę podaj inną liczbę");
        }

    }

}

//IF, ELSE - jeśli pierwsza część kodu nie spłenia warunku, to wykonaj dalszą część kodu