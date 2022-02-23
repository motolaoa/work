package 生产消费2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author hasee
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<Goods>(5);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
