abstract class Abstraction {
    abstract void sound();
}

class Dog extends Abstraction {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Abstraction A  = new Dog();
        A.sound();
    }
}