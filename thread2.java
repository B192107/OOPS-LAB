class Data {
    private boolean isProduced = false;

    public synchronized void produceData() {
        // Simulate data production
        // For example, setting a flag to indicate data is produced
        isProduced = true;
        notify(); // Notify the waiting consumer thread
    }

    public synchronized boolean isProduced() {
        return isProduced;
    }
}

class Producer extends Thread {
    private Data data;

    public Producer(Data data) {
        this.data = data;
    }

    public void run() {
        // Simulate data production
        // For example, producing data after some processing
        // Here, we simply call the produceData method
        data.produceData();
    }
}

class Consumer extends Thread {
    private Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            // Check data production status every 10 milliseconds
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (data.isProduced()) {
                System.out.println("Data is produced. Consuming...");
                break;
            } else {
                System.out.println("Data is not yet produced. Waiting...");
            }
        }
    }
}

public class thread2{
    public static void main(String[] args) {
        Data data = new Data();

        // Create and start the producer thread
        Producer producerThread = new Producer(data);
        producerThread.start();

        // Create and start the consumer thread
        Consumer consumerThread = new Consumer(data);
        consumerThread.start();
    }
}
