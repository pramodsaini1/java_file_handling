package java_file_handling;
import java.io.*;
public class FileList {
    public static void main(String []arr)throws IOException{
          File f = new File("c:/java_coding");
          String s[]=f.list();
          for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
          }
    }
}
