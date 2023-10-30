package java_file_handling;
import java.io.*;
public class ff {
    public static void main(String []arr)throws IOException{
        String path="c://java_code";
        File f = new File(path);
        String s[]=f.list();
        for(int i=0;i<s.length;i++){
            String cpath=path+"/"+s[i];
            File fr = new File(cpath);
            if(fr.isDirectory()){
                System.out.println("Folder:"+s[i]);
            }
            else if(fr.isFile()){
                System.out.println("File:"+s[i]);
            }
        }
    }
}
