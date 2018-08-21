import java.util.Queue;

/**
 * Consumer
 */
public class Consumer extends Thread {

    private Queue sharedQueue;

    public Consumer(Queue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (sharedQueue) {
                while (sharedQueue.size() == 0) {
                    try {
                        System.out.println("队列已空，等待生产者生产");
                        sharedQueue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                int number = (Integer) sharedQueue.poll();
                System.out.println("消费者消费了 " + number);
                sharedQueue.notify();
            }
        }
    }

}