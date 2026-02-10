public class Encapsulation {
    private String name;
    private int age;

    
    public void setName(String n) {
        name = n;
    }

    
    public String getName() {
        return name;
    }


    public void setAge(int a) {
        age = a;
    }

    
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setName("Omar");
        e1.setAge(20);

        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());

        Encapsulation e2 = new Encapsulation();
        e2.setName("Ali");
        e2.setAge(25);

        System.out.println("Name: " + e2.getName());
        System.out.println("Age: " + e2.getAge());
    }
}
