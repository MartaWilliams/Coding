//porównują elementy równania i zwracają logiczną wartość (true / false)

public class OperatoryPorównania {

    public static void main(String[] args) {
     int fiestNumber =4;
     int secondNumber = 6;

     boolean result = secondNumber > fiestNumber; // true

        System.out.println(result);
        System.out.println(fiestNumber > secondNumber); //false
        System.out.println(fiestNumber < secondNumber); // true
        System.out.println(fiestNumber >= secondNumber); // false
        System.out.println(fiestNumber <= secondNumber); //true
        System.out.println(fiestNumber == secondNumber); //false
        System.out.println(fiestNumber != secondNumber); //true
    }
}
