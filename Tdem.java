package java_file_handling;

public class Tdem extends Thread {
    public Tdem(String s){
        super(s);
        start();
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
        Tdem d = new Tdem("First");
        for(int i=1;i<=5;i++){
           try{
            System.out.println(i);
             Thread.sleep(100);
           }
           catch(InterruptedException e){}
        }
    }
}
