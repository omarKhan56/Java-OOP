public class Inheritance1 {
    void show(){
        System.out.println("this is base class Function");
    }
}

class Child extends Inheritance1{
    void display(){
        System.out.println("this is child class Function");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
    }
}