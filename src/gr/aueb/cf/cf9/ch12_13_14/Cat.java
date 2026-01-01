package gr.aueb.cf.cf9.ch12_13_14;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "," + "Age: " + getAge();
    }
}
