
//umozliwiają wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber =4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

      int addition   = firstNumber + secondNumber; //10
      int subtraction = firstNumber - secondNumber; //-2
      int multiplication = firstNumber * secondNumber; //24
      float division = thirdNumber/secondNumber; // 0,66
      int mod = secondNumber%firstNumber; // ile razy 4 mięsci się w 6 - 1, 2

        /* System.out.println("dodawanie " + addition);
        System.out.println("odejmowanie " + subtraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("dzielenie " + division);
        System.out.println("mMdulo " + mod);*/

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber
        System.out.println("po dodaniu " + firstNumber); //10
        firstNumber-=secondNumber; //firstNumber - secondNumber
        System.out.println("po odejmowaniu "+ firstNumber); //4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("po mnozeniu " + firstNumber); //24
        firstNumber/=secondNumber; //firstNumber / secondNumber
        System.out.println("po dzieleniu "+ firstNumber); //4
        firstNumber%=secondNumber; //firstNumber % sexomdNumber
        System.out.println("po modulo " + firstNumber); //4


    }
}
