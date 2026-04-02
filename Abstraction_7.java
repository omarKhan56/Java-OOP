interface Abstraction_7 {
    default void show(){
        System.out.println("A");
    }
    
}
class B implements Abstraction_7 {
    public void show(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        Abstraction_7 obj = new B();
        obj.show();  
    }
}
