public class Multilevel1_inheritance {
    void cricket(){
        System.out.println("Cricket is a popular sport");
    }
    void football(){
        System.out.println("Football is a popular sport");
    }
    
    
}
class Swimming extends Multilevel1_inheritance{
    void swimming(){
        System.out.println("Swimming is a popular sport");
    }
}
class Tennis extends Swimming{
    void tennis(){
        System.out.println("Tennis is a popular sport");
    }
    public static void main(String[] args) {
        Tennis t = new Tennis();
        t.cricket();
        t.football();
        t.swimming();
        t.tennis();

        Swimming s = new Swimming();
        s.cricket();
        s.football();
        s.swimming();
        




    }
}
