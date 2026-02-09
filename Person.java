public class Person {
    //Instance Variables (Attributes) 
    // They are defined inside the class but outside any method
    String name;
    int age;

    Person(){
        name = "Omar";
        age = 20;
    }

    Person(String n , int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){ //This is where Java starts execution.
        Person p1 = new Person();
        //new Person() → this actually creates a new object of the class Person in memory (heap).
        p1.name = "Omar";
        p1.age = 20;
        p1.display();

        Person p2 = new Person("Ali", 25);
        p2.display();
    }
    
}

