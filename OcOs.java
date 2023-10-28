package java_file_handling;
import java.io.*;
public class OcOs {
    public static void main(String []arr)throws IOException{
        try{
            FileInputStream fr = new FileInputStream("OcOs");
            FileOutputStream fw = new FileOutputStream("dgp.txt");
            PrintStream out = new PrintStream(fw);
            int i;
            while(true){
                i=fr.read();
                if(i==-1){
                    break;
                }
                if(i>=65 && i<=90){
                    i=i+32;
                }
                else if(i>=97 && i<=122){
                    i=i-32;
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
