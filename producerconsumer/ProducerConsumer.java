import java.util.LinkedList;
import java.util.Queue;

/**
 * ProducerConsumer
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        Queue queue = new LinkedList<>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
    
}