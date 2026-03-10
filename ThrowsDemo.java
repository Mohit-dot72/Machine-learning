import java.util.Scanner;

class Calc12 {
    int a,b;

    void fun() throws ArithmeticException {
        int c = a/b;
        System.out.println("Division = " + c);
    }
}

public class ThrowsDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calc12 obj = new Calc12();
        System.out.println("Enter two numbers");

        if (sc.hasNextInt()) obj.a = sc.nextInt();
        if (sc.hasNextInt()) obj.b = sc.nextInt();

        try {
            obj.fun();
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
