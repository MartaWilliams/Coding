
//instrukcja sterująca switch

public class Switch {
    public static void main(String[] args) {

        String danie = "Krewetki";
        switch (danie) {
            case "Pizza":
                System.out.println("Cena 25 zł");
                break;
            case "Losos":
                System.out.println("Cena 34 zł");
                break;
            case "Frytki":
                System.out.println("Cena 9 zł");
                break;
            default:
                System.out.println("Brak dania w menu");
        }
    }
}
