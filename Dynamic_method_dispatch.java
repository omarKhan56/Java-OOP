public class Dynamic_method_dispatch {
    void Car(){
        System.out.println("This is a car");

    }
    
}
class Train extends Dynamic_method_dispatch{
    void Car(){
        System.out.println("This is a train");
    }
}

class Jeep extends Dynamic_method_dispatch {
    void Car(){
        System.out.println("This is a jeep");
    }
    public static void main(String[] args) {
        Dynamic_method_dispatch d;
        
        d = new Train();
        d.Car();

        d = new Jeep();
        d.Car();
    }


}
    
