class MyThread16 implements Runnable {
    Thread t;

    MyThread16(String name) {
        t = new Thread(this,name);
        t.start();
    }

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class TS {
    public static void main(String args[]) throws Exception {
        MyThread16 t1 = new MyThread16("One");
        MyThread16 t2 = new MyThread16("Two");

        System.out.println("Thread one alive : "+t1.t.isAlive());
        System.out.println("Thread two alive : "+t2.t.isAlive());

        t1.t.join();
        t2.t.join();

        System.out.println("Main thread ending");
    }
}
