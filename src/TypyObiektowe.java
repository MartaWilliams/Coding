public class TypyObiektowe {
   //przechowują aktualna wartosc oraz umozliwoaja wykonanie akcji (wywołanie metod) na tych danych
    public void main (String[]args){

        //TYPY PROSTE

        //liczby stałoprzecinkowe
        Byte firstNumber = 127; //1 bajt -128 do 127
        Short secondNumber = 32689; //2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; //4 bajty -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L; //8 bajtów - 2^63 do (2^63)-1

        //liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max 6-7 liczb po przecinku
        Double sixthNumer = 3.9999999999D; //8 bajtów - max 15 cyfr po przecinku

        //wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedyńczy znak
        Character letter = 'A';

        //ciągiznaków
        String hello = "Hello Bartek";



    }
}
