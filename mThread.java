package java_file_handling;

public class mThread  implements Runnable{
    Thread t ;
    mThread(String s){
        t = new Thread(this ,s);
        t.start();
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println(t.getName()+""+i);
                t.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
class Demo{
    public static void main(String []arr){
        mThread d1 = new mThread("First");
        mThread d2 = new mThread("Second");
        mThread d3 = new mThread("Third");
    }
}
