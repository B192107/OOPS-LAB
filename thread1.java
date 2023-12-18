class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class thread1 {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThread myThread = new MyThread();

        // Starting the thread
        myThread.start();

        // Main thread continues to run alongside the new thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread - Count: " + i);
        }

        // Wait for the thread to finish (optional)
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread and MyThread have both finished.");
    }
}
