class Calc8 {
    int a,b;

    Calc8(int a,int b) {
        this.a = a;
        this.b = b;
    }

    void run() {
        try {
            int c = a/b;
            System.out.println("Division = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println("Error : Division by zero");
        }
    }
}

public class Test8 {
    public static void main(String args[]) {
        Calc8 obj = new Calc8(10,0);
        obj.run();
    }
}
