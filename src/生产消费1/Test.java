package 生产消费1;

public class Test {
    public static void main(String[] args) {
        Goods goods=new Goods();
        Producer producer=new Producer(goods);
        Consumer consumer=new Consumer(goods);

        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.start();
        t2.start();


    }
}
