public class AutoTest {
//metoda
    public static void main(String[] args) {
// klasa = Auto, nazwa zmiennej = mercedes, obiekt klasy = new nazwa klasy () = new Auto()
        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.color = "Srebrny";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "Audi A5";
        audi.color = "Czerwony";
        audi.rok = 2019;
        audi.przebieg = 50000;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();
        noName.jedz();
        noName.hamuj();
        noName.info();

    }
}
