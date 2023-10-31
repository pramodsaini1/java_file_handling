package java_file_handling;

public class mTh  extends Thread{
    public mTh(String s){
        super(s);
        start();
    }
    public void  run(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println(Thread.currentThread().getName()+" "+i);  
                Thread.sleep(100);                                                                                                                                                                                                                           
            }
            catch(InterruptedException e){}
        }
    }
}
class Dem{
    public static void main(String []arr){
        mTh d1 = new mTh("First");
        mTh d2 = new mTh("Second");
        mTh d3 = new mTh("Third");
    }
}
