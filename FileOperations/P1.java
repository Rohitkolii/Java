import java.io.*;

public class P1{
    public static void main(String arg[])throws IOException{
        File f = new File("C:\\Users\\aa\\Desktop\\new.txt");
        f.createNewFile();

        if(f.exists()){
            System.out.println("File Name : " + f.getName());
            System.out.println("File Path : " + f.getAbsolutePath());
            System.out.println("File Length : " + f.length());
            System.out.println("File Writable : " + f.canWrite());
            System.out.println("File Readable : " + f.canRead());
        }else{
            System.out.println("File Not Exists");
        }
    }
}