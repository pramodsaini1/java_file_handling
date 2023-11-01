package java_file_handling;

public class Prioritythread implements Runnable {
    Thread t ;
    Prioritythread(String s,int p){
        t= new  Thread(this,s);
        t.start();
        t.setPriority(p);
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                System.out.println(t.getName()+" "+i);
                t.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }

}
class Demo{
    public static void main(String []arr){
        Prioritythread t1 = new Prioritythread("First");
        Prioritythread t1 = new Prioritythread("Second");
        Prioritythread t1 = new Prioritythread("Third");
    }
}
