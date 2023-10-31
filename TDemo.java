package java_file_handling;

public class TDemo implements Runnable {
    Thread t ;
    TDemo(String s){
        t = new Thread(this,s);
        t.start();
    }
    public void run(){
        for(int i=11;i<=15;i++){
            try{
                System.out.println(i);
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
class Demo{
    public static void main(String []arr){
        TDemo d = new TDemo("First");
        for(int i=1;i<=5;i++){
            try{
                System.out.println(i);
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
