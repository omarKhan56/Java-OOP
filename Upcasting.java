public class Upcasting {
    void hello(){
        System.out.println("Hello");

    }
    
}

class Car extends Upcasting{
    void hello(){
        System.out.println("Hello from Car");
    
    }
    public static void main(String[] args) {
        Upcasting u = new Car();
        u.hello();
    }
}
