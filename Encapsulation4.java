public class Encapsulation4 {

    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Encapsulation4 p1 = new Encapsulation4();
        p1.setName("Omar");
        p1.setAge(20);
        p1.display();

        Encapsulation4 p2 = new Encapsulation4();
        p2.setName(null);
        p2.setAge(-5);
        p2.display();
    }
}


