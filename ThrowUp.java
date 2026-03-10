class Calc11 {
    int a,b;

    Calc11(int a,int b) {
        this.a=a;
        this.b=b;
    }

    void run() {
        try {
            if(b==0) {
                throw new ArithmeticException("Division by zero not allowed");
            }
            int c = a/b;
            System.out.println("Division = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

public class ThrowUp {
    public static void main(String args[]) {
        Calc11 obj = new Calc11(10,0);
        obj.run();
    }
}
