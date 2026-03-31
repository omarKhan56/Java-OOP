interface Abstraction_5 {
    void start();
}
class Car implements Abstraction_5 {
    public void start() {
        System.out.println("Car is starting");
    }
}
class Bike implements Abstraction_5 {
    public void start() {
        System.out.println("Bike is starting");
    }
    public static void main(String[] args) {
        Abstraction_5 car = new Car();
        Abstraction_5 bike = new Bike();

        car.start();
        bike.start();
    }
}

    

