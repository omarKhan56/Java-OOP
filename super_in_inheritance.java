public class super_in_inheritance {
    super_in_inheritance(String name){
        System.out.println("This is base class constructor");

    

    }
    
}
class child extends super_in_inheritance{
    child(){
        super("Omar");
        System.out.println("This is child class constructor");
    }
    public static void main(String[] args) {
        child c = new child();
        
        

    }
}
