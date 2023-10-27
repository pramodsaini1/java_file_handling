package java_file_handling;
import java.io.*;
public class FileRead {
    public static void main(String []arr){
        try{
            FileInputStream fr = new FileInputStream("FileRead.java");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
 
}
