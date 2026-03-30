abstract class Abstraction_2 {   // ✔ make it abstract
    abstract void sound();

    void sleep() {
        System.out.println("Dog sleeps");
    }
}

class Dog extends Abstraction_2 {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Abstraction_2 a = new Dog();  // ✔ correct reference
        a.sound();
        a.sleep();
    }
}