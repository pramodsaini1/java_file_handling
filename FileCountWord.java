package java_file_handling;
import java.io.*;
public class FileCountWord {
    try{
          FileInputStream fr = new FileInputStream("FileCountWord.java");
          int i,count=0,word=0;
          while(true){
            i=fr.read();
            if(i==-1){
                break;
            }
            if((count==0)&&(i>=48 && i<=57) ||(i>=65 && i<=90) || (i>=97 && i<=122)){
                count++;
                word ++;
            }
            if(!(i>=48 && i<=57) ||(i>=65 && i<=90) || (i>=97 && i<=122)){
                count=0;
            }
          }
          System.out.println("Total number of word:"+word);
          fr.close();
    }
    catch(FileNotFoundException e){
        System.out.println("File Not Found");
    }
}
