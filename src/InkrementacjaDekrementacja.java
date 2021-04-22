public class InkrementacjaDekrementacja {


    public static void main(String[] args) {

        // INKREMENTACJA - ZWIĘKSZENIE WARTOŚCI O JEDEN
        int a = 0;
        System.out.println("Wartosć a:" + a); // a= 0
        //post imprementacja
        int b = a++;
        System.out.println("Wartość b:"+ b); // b= 0 - nastepuje przypisanie starej wartości a=0 a dopiero później zwiększamy ją o jeden
        System.out.println("Wartość a:" + a ); // a=1
        //preimprementacja
        int c = ++a;
        System.out.println("Wartość c:" + c); // c= 2 - najpierw zwiększamy wartość a, dopiero potem przypisujemy jej wartość do c
        System.out.println("Wartość a:" + a); // a= 2

        //DEKREMENTACJA - ZMNIEJSZENIE WARTOŚCI O JEDEN
        int d = 0;
        System.out.println("Wartosć d:" + d); // d= 0
        //postdekrementacja
        int e= d--;
        System.out.println("Wartość e:"+ e); // e= 0
        System.out.println("Wartość d:" + d ); // d= -1
        //predekrementacja
        int f = --d;
        System.out.println("Wartość f:" + f); // f= -2
        System.out.println("Wartość d:" + d); // d= -2

    }
}

/*public class InkrementacjaDekrementacja {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("Wartosć a:" + a); // a=  0
        //post imprementacja
        int b = ++a;
        System.out.println("Wartość b:" + b); // b= 1
        System.out.println("Wartość a:" + a); // a= 1


    }
}*/
