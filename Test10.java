import java.util.Scanner;

class Calc10 {
    int a,b;

    Calc10(int a,int b) {
        this.a=a;
        this.b=b;
    }

    void run() {
        try {
            int c = a/b;
            int arr[] = {1,2,3};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
        catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
        catch(Exception e) {
            System.out.println("Unexpected error");
        }
        System.out.println("After try-catch block");
    }
}

public class Test10 {
    public static void main(String args[]) {
        Calc10 obj = new Calc10(10,0);
        obj.run();
    }
}
