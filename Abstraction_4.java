abstract class A {
    int x = 10;           // instance variable
    static int y = 20;    // static variable

    void showValues() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

class B extends A {
    void display() {
        System.out.println("Accessing from child class:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

public class Abstraction_4 {   // ✔ matches file name
    public static void main(String[] args) {
        B obj = new B();

        obj.showValues();   // from abstract class
        obj.display();      // from child class
    }
}