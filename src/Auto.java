public class Auto {

 public String marka;
 public String model;
 public String color;
 public Integer rok;
 public Integer przebieg;

 public void jedz (){
        System.out.println("Jedz!");
    }
    public void hamuj (){
        System.out.println("Hamuj!");
    }
    public void info () {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Kolor: " + color);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg);

    }
}
