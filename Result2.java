public class Result2 {
    private String name;
    private int age;

    // Constructor with parameters + validation
    public Result2(String name, int age) {
        this.name = name;

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be greater than 0.");
            this.age = 0;
        }
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter
    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------");
    }

    public static void main(String[] args) {
        Result2 r1 = new Result2("Omar", 22);
        r1.display();

        Result2 r2 = new Result2("Ali", 25);
        r2.display();
    }
}
