//Stworzyć 3 obiekty klasy Student. Przypisz wartości do pol. Stwórz i dodaj studentów do tablicy.
// Przejdz przez Studentów w tablicy i wywołaj wszytskie 4 metody


import java.util.Scanner;

public class StudentHM {

    public static void main(String[] args) {

        Student numerJeden = new Student();
        numerJeden.imie = "Jacek";
        numerJeden.nazwisko = "Nowak";
        numerJeden.nick = "JackNow";
        numerJeden.numerIndeksu = 343434;
        numerJeden.email = "jacek.nowak@gmail.com";

        Student numerDwa = new Student();
        numerDwa.imie = "Daniela";
        numerDwa.nazwisko = "Duda";
        numerDwa.nick = "DaDu";
        numerDwa.numerIndeksu = 900900;
        numerDwa.email = "daniela.duda@wp.pl";

        Student numerTrzy = new Student();
        numerTrzy.imie = "Tomek";
        numerTrzy.nazwisko = "Tomiczek";
        numerTrzy.nick = "TomTom";
        numerTrzy.numerIndeksu = 321321;
        numerTrzy.email = "tomek.tomiczek@op.pl";

        Student[] Studenci = new Student [3];
        Studenci [0] = numerJeden;
        Studenci [1] = numerDwa;
        Studenci [2] = numerTrzy;

        for (int i =0; i < Studenci.length; i++) {
            Studenci[i].przedstawSie();
            Studenci[i].zalogujSie();
            Studenci[i].podajNrIndeksu();
            Studenci[i].podajEmail();
        }

        /*String [] Studenci = new String [3];
        Studenci [0] = numerJeden.imie + " " + numerJeden.nazwisko + " " +  numerJeden.nick + " " + numerJeden.numerIndeksu + " " + numerJeden.email;
        System.out.println(Studenci [0]);

        Studenci [1] = numerDwa.imie + " " + numerDwa.nazwisko + " " +  numerDwa.nick + " " + numerDwa.numerIndeksu + " " + numerDwa.email;
        System.out.println(Studenci [1]);

        Studenci [2] = numerTrzy.imie + " " + numerTrzy.nazwisko + " " +  numerTrzy.nick + " " + numerTrzy.numerIndeksu + " " + numerTrzy.email;
        System.out.println(Studenci [2]);

        numerJeden.przedstawSie();
        numerJeden.zalogujSie();
        numerJeden.podajNrIndeksu();
        numerJeden.podajEmail();

        numerDwa.przedstawSie();
        numerDwa.zalogujSie();
        numerDwa.podajNrIndeksu();
        numerDwa.podajEmail();

        numerTrzy.przedstawSie();
        numerTrzy.zalogujSie();
        numerTrzy.podajNrIndeksu();
        numerTrzy.podajEmail();*/

        //Inne klasy :
    String imie = "Kasia";
    Scanner scanner = new Scanner(System.in);

    }

    }

