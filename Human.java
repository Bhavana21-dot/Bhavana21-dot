class Human extends Thread{
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" is using the bathroom");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" is finished using the bathroom");
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}