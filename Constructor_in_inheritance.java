public class Constructor_in_inheritance {
     Constructor_in_inheritance(){
        System.out.println("This is base class constructor");

     }

    
}
class child extends Constructor_in_inheritance{
    child(){
        System.out.println("This is child class constructor");
    }
    public static void main(String[] args) {
        child c = new child();
        

    }
}

