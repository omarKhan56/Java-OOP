public class Static  {
    String name;
    static String collage = "MGM JNEC";

    Static(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: " + name + " Collage: " + collage);
    }

    public static void main(String[] args) {
        Static s1 = new Static("Omar");
        s1.display();
        Static s2 = new Static("Ali");
        s2.display();


    }
    
}
