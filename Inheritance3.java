public class Inheritance3 {
    void cricket(){
        System.out.println("Cricket is a popular sport");
    }
    void football(){
        System.out.println("Football is a popular sport");
    }
    
}

class Swimming extends Inheritance3{
    void swimming(){
        System.out.println("Swimming is a popular sport");
    }
}

class Tennis extends Inheritance3{
    void tennis(){
        System.out.println("Tennis is a popular sport");
    }
    public static void main(String[] args) {
        Swimming s = new Swimming();
        s.cricket();
        s.football();
        s.swimming();
        Tennis t = new Tennis();
        t.cricket();
        t.football();
        t.tennis();


    }
}

