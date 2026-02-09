public class Encapsulation3 {

    private String name;
    private int age;

    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be greater than 0.");
        }
    }

  
    public int getAge() {
        return age;
    }

 
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation3 p1 = new Encapsulation3();

        // Valid age
        p1.setAge(22);
        System.out.println("Age after valid input: " + p1.getAge());

        // Invalid age
        p1.setAge(-5);
        System.out.println("Age after invalid input: " + p1.getAge());
    }
}


