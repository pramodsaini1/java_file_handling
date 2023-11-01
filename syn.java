package java_file_handling;

public class syn {
    Synchronized void display(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
class TDemo implements Runnable{
    Thread t ;
    Static syn d = new syn();
    TDemo(String s){
        t = new Thread(this,s);
        t.start();
    }
    public void run(){
      d.display();

    }
}
class Demo{
    public static void main(String []arr){
        TDemo t1 = new TDemo("First");
        TDemo t2 = new TDemo("Second");
        TDemo t3 = new TDemo("Third");
    }
}