class MyThread13 implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Child Thread : " + i);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class Test13 {
    public static void main(String args[]) {
        Thread t = new Thread(new MyThread13());
        t.start();
    }
}
