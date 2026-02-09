public class Result {
    String name;
    int marks;
    int prn;

    Result(){
        name = "Omar";
        marks = 90;
        prn = 12345;
    }
    Result(String n , int m , int p){
        name = n;
        marks = m;
        prn = p;

    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("PRN: " + prn);
    }
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.display();
        Result r2 = new Result("Ali", 80, 54321);
        r2.display();


    }
    
}
