package lesson6;

public class cat extends Animals {
    boolean acce ssToAHuman;


    public cat(String animal,
               String name,
               int age,
               int weight){
        super(animal,
                name,
                age,
                weight);
        this.accessToAHuman = false;
    }

    public cat(boolean accessToAHuman,
               String animal,
               String name,
               int age,
               int weight) {
        super(animal,
                name,
                age,
                weight);
        this.accessToAHuman = accessToAHuman;
    }

    @Override
    public void eat() {
        System.out.println("Kitekat");

    }
}
