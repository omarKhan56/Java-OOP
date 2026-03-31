interface Abstraction_6 {
    int MAX_SPEED = 120;  // static and final by default
    void drive();         
    
}
class Car implements Abstraction_6 {
    public void drive() {
        System.out.println("Car is driving at speed: " + MAX_SPEED);
    }
}
class Bike implements Abstraction_6 {
    public void drive() {
        System.out.println("Bike is driving at speed: " + MAX_SPEED);
    }
    public static void main(String[] args) {
        Abstraction_6 car = new Car();
        Abstraction_6 bike = new Bike();

        car.drive();
        bike.drive();
    }
}
