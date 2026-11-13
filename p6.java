public class p6 {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyRunnable mr = new MyRunnable();
        Thread tfr = new Thread(mr);
        mt.start();
        tfr.start();
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("This is a thread.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This is a thread using Runnable.");
    }
}