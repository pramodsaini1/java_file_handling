package java_file_handling;
import java.io.*;
public class FileCountCharcter {
    public static void main(String []arr)throws IOException{
        try{
              FileInputStream fr = new FileInputStream("FileCountCharcter.java");
              int i,count=0;
              while(true){
                  i=fr.read();
                  if(i==-1){
                    break;
                  }
                  count++;
                  System.out.println((char)i);
              }
              System.out.println("Total No.of Charcter:"+count);
              fr.close();
        }
        catch(FileNotFoundException e){
              System.out.println("File Not Found");
        }
    }
     
}
