public class cricket {
    String team;
    String BestPlayer;
    String BestBowler;
    int points;

    cricket(){
        team = "India";
        BestPlayer = "Rohit Sharma";
        BestBowler = "Mohammed Siraj";
        points = 100;
    }
    cricket(String t, String bp, String bb, int p){
        team = t;
        BestPlayer = bp;
        BestBowler = bb;
        points = p;
    }
    void display(){
        System.out.println(BestPlayer);
        System.out.println(BestBowler);
        System.out.println(points);


    }
    public static void main(String[] args) {
        cricket c1 = new cricket();
        c1.display();

        cricket c2 = new cricket("Australia", "David Warner", "Mitchell Starc", 90);
        c2.display();
    }

    
}
