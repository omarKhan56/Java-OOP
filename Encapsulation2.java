public class Encapsulation2 {
    private String name;
    private int age;
    private int DOB;
    private String address;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setDOB(int DOB){
        this.DOB = DOB;
    }
    public int getDOB(){
        return DOB;
    }
    public void setAddress(String address){
        this.address = address;
        }
    public String getAddress(){
        return address;
    }
    
    public static void main(String[] args){
        Encapsulation2 e1 = new Encapsulation2();
        e1.setName("Omar");
        e1.setAge(20);
        e1.setDOB(2004);
        e1.setAddress("123 Main St");

        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
        System.out.println("DOB: " + e1.getDOB());
        System.out.println("Address: " + e1.getAddress());

        

    }



    
}
