import java.io.*;
public class CopyFileData{
    public static void main(String arg[])throws Exception{
        FileInputStream r = new FileInputStream("C:\\Users\\aa\\Desktop\\File1.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\aa\\Desktop\\File2.txt");

        int i;
        while((i=r.read()) != -1){
            w.write((char)i);
        }
            System.out.print("Data Copied...");
    }
}