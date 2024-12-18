class Queue{
    int data;
    public void put(int i){
        data=i;
        System.out.println("Data added..... the data value is : "+i);
    }
    public void get(){
        System.out.println("Data Retrived.. the data value is : "+data);
    }
}
class Producer extends Thread{
    Queue a;
    public Producer(Queue q){
        a=q;
    }
    @Override 
    public void run(){
        int i=0;
        while(true){
            a.put(i);
            i++;

        }
    }
}
class Consumer extends Thread{
    Queue b;
    public Consumer(Queue q){
        b=q;

    }
    @Override
    public void run(){
        int i=0;
        while(true){
            b.put(i);
            i++;
        }
    }
}