
//działają na wartosciach logicznych i zwracają również wartości logiczne

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fouthValuse = true;

        //&& and -> true wtedy gdy wyrażenia  skłądowe sa równe true
        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue&& fouthValuse); //true
        System.out.println( secondValue && thirdValue); // false

        //  || lub -> true gdy conajmniej jedno  wyrażenie składowe jest równe true
        System.out.println(firstValue || secondValue); // true
        System.out.println(firstValue || fouthValuse); //true
        System.out.println(secondValue || thirdValue); //false

        // ! - negacja - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(!(firstValue&&secondValue)); // true
    }

}

// oberatory będa wykorzystywane w instrukcjach warunkowych, za pomocą których bedziemy sterowac programami
