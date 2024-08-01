import java.io.*;
public class ReadInFile{
    public static void main(String arg[])throws Exception{
        FileReader f = new FileReader("C:\\Users\\aa\\Desktop\\letsWrite.txt");

        int i;
        while((i=f.read()) != -1){
            System.out.print((char)i);
        }

        f.close();
    }
}