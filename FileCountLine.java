package java_file_handling;
import java.io.*;
public class FileCountLine {
    try{
         FileInputStream fr = new FileInputStream("FileCountLine");
         int i,count=0,line=0;
         while(true){
            i=fr.read();
            if(i==-1){
                break;
            }
            count++;
            if(count==1){
                line++;
            }
            if(i=='\n'){
                count=0;
            }
         }
         System.out.println("Total Number Of Line:"+line);
         fr.close();
    }
    catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
}
