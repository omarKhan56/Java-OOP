public class Person {
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

    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Omar";
        p1.age = 20;
        p1.display();

        Person p2 = new Person("Ali", 25);
        p2.display();
    }
    
}

