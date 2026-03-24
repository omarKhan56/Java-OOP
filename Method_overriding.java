public class Method_overriding {
    void pay(){
        System.out.println("Generic Payment");
    }
    
}
class CreditCard extends Method_overriding{
    @Override
    void pay(){
        System.out.println("Credit card Payment");
    }
}
class UPI extends Method_overriding{
    @Override
    void pay(){
        System.out.println("UPI Payment");
    }
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.pay();
        UPI upi = new UPI();
        upi.pay();
    }
}




