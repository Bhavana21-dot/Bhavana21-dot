
public class Start{
    public static void main(String[] args)  throws InterruptedException {

        MSOffice m1=new MSOffice();
        MSOffice m2=new MSOffice();
        MSOffice m3=new MSOffice();
        
        m1.setName("typing");
        m2.setName("spellcheck");
        m3.setName("saving");

        m1.start();
        m2.start();
        m3.start();
    }
}