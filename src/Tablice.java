//struktury pozwalające gromadzić większe ilosci danych

public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Kasia";
        imiona [2] = "Marta";

       /* System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);*/

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};
        /*System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length); // wskazuje ile elemntów znajduje się w tabeli */

        for (int i=0; i<lottoNumbers.length;i++) {
            System.out.println(lottoNumbers[i]);
        }

    }
}
