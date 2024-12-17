public class Test{
    public static void main(String[] args) {
        Human h1=new Human();
        Human h2=new Human();
        Human h3=new Human();

        h1.setName("boys");
        h2.setName("Girls");
        h3.setName("others");

        h1.start();
        h2.start();
        h3.start();
    }
}