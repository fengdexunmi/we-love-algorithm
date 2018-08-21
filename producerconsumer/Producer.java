import java.util.Queue;

public class Producer extends Thread {

    public static final int MAX_QUEUE_SIZE = 5;

    private Queue sharedQueue;

    public Producer(Queue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() >= MAX_QUEUE_SIZE) {
                    System.out.println("队列已满，等待消费者消费...");
                    try {
                        sharedQueue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                sharedQueue.add(i);
                System.out.println("生产者生产 " + i);
                sharedQueue.notify();
            }
        }
    }
	
}