class NewThread14 implements Runnable {
    Thread t;

    NewThread14(String name) {
        t = new Thread(this,name);
        t.start();
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class MultiThread {
    public static void main(String args[]) {
        new NewThread14("One");
        new NewThread14("Two");
        new NewThread14("Three");
    }
}
