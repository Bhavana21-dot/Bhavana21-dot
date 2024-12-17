public class Producer1{
    public static void main(String[] args) {
        Queue q=new Queue();
        (new Producer(q)).start();
        (new Consumer(q)).start();
    }
}