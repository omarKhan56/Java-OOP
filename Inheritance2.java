public class Inheritance2 {
    void start(){
        System.out.println("Vehicle is starting");
    }
    void stop(){
        System.out.println("Vehicle is stopping");

    }
    
}

class car extends Inheritance2{
    void fueltype(){
        System.out.println("Car fuel type is petrol");
    }
}

class train extends Inheritance2{
    void fueltype(){
        System.out.println("Train fuel type is diesel");
    }
}

class aeroplane extends Inheritance2{
    void fueltype(){
        System.out.println("Aeroplane fuel type is aviation fuel");
    }
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.fueltype();
        c.stop();

        train t = new train();
        t.start();
        t.fueltype();
        t.stop();

        aeroplane a = new aeroplane();
        a.start();
        a.fueltype();
        a.stop();
        
    }
}

    


