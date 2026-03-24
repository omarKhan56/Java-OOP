public class Method_overloading {

    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Method_overloading mo = new Method_overloading();
        System.out.println(mo.add(10, 20));
    }
}