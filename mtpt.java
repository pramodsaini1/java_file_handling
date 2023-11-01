package java_file_handling;

public class mtpt extends Thread {
      mtpt(String s,int p){
           super(s);
           setPriority(p);
           start();
      }
      public void run(){
        for(int i=1;i<=5;i++){
            try{
                 System.out.println(Thread.currentThread().getName()+" "+i);
                 Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
      }
}
class Demo{
    public static void main(String []arr){
        mtpt t1 = new mtpt("First", Thread.NORM_PRIORITY+3);
        mtpt t2 = new mtpt("First", Thread.MAX_PRIORITY+3);
        mtpt t3 = new mtpt("First", 10);

    }
}
