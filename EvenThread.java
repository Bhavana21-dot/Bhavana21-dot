public class EvenThread{
    public static void main(String[] args) throws InterruptedException{
        Number n1=new Number();
        Number n2=new Number();

        Thread t1=new Thread();
        Thread t2=new Thread();

        n1.setName("Even");
        n2.setName("Odd");

        n1.start();
        n2.start();
    }
}