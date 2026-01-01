package gr.aueb.cf.cf9.ch12_13_14;

public class Main14 {
    public static void main(String[] args) {
        Animal mouse = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        mouse.speak();
        dog.speak();
        cat.speak();

        doSpeak(mouse);
        doSpeak(dog);
        doSpeak(cat);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
