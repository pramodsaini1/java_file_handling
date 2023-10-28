package java_file_handling;
import java.io.*;
public class coptoano {
    public static void main(String []arr) throws IOException{
         try{
               FileInputStream fr = new FileInputStream("coptoano");
               FileOutputStream fw = new FileOutputStream("pk.txt");
               PrintStream out=new PrintStream(fw);
               int i;
               while(true){
                  i=fr.read();
                  if(i==-1){
                    break;
                  }
                  out.print((char)i);
               }
               fr.close();
               fw.close();
         }
         catch(FileNotFoundException e){
            System.out.println("File Not Found");
         }
    }
}
