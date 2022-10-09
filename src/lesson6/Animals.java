package lesson6;

import java.util.Objects;

abstract public class Animals {
    private String animal;
    private String name;
    private int age;
    private int weight;

    public Animals(){

    }

    public Animals(String animal,
                   String name,
                   int age,
                   int weight) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }



    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    abstract public void eat();
    public void sayHello(){
        System.out.println("Hello i am a " + animal + name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && weight == animals.weight && Objects.equals(animal, animals.animal) && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animal, name, age, weight);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animal='" + animal + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
