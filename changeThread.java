package java_file_handling;

public class changeThread {
    public static void main(String []arr){
        Thread t = Thread.currentThread();
        t.setName("parent");
        System.out.println(t);
    }
}
