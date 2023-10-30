package java_file_handling;
import java.io.*;
public class StringRead {
    public static void main(String []arr)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        System.out.println("Enter Name:");
        s=br.readLine();
        System.out.println(s);
    }
}
