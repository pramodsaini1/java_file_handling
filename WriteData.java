package java_file_handling;
import java.io.*;
public class WriteData {
    public static void main(String []arr)throws IOException{
        try{
             FileOutputStream fw = new FileOutputStream("demo.txt");
             PrintStream out=new PrintStream(fw);
             out.print("pramod");
             fw.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
