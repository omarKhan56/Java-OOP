public class Car {
    String name;
    int model;
    int price;

    Car(){
        name = "Toyota";
        model = 2020;
        price = 20000;
    }
    Car(String n, int m, int p){
        name = n;
        model = m;
        price = p;
    }
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Model "+model);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();

        Car c2 = new Car("Honda", 2021, 25000);
        c2.display();
    }
    
}
