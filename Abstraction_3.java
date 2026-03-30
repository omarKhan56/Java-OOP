abstract class Abstraction_3 {
    Abstraction_3() {   // ✔ constructor name fixed
        System.out.println("A");
    }
}

class B extends Abstraction_3 {
    B() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
