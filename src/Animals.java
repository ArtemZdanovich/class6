public class Animals {

    public static void main(String[] args) {
        Animals cat;

    }
}
class Animal {
    String animal;
    String name;
    int age;
    double weight;
    void displayInfo(){
        System.out.printf("Animal: %s \tName: %s \tAge: %d \tWeight: %1f\n", animal, name, age, weight);
    }
}