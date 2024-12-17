public class Synchronization{
    public static void main(String[] args) {

        Warrior w1=new Warrior();
        Warrior w2=new Warrior();

        w1.setName("Student1");
        w2.setName("Student2");
                
        w1.start();
        w2.start();
    }
}