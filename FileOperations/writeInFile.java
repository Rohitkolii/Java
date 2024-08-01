import java.io.*;
import java.util.Scanner;
public class writeInFile{
    public static void main(String arg[]) throws IOException{
        Scanner s = new Scanner(System.in);
        FileWriter f = new FileWriter("C:\\Users\\aa\\Desktop\\letsWrite.txt");
        String a;
        System.out.println("Write Text here : ");
        a=s.nextLine();
        f.write(a);
        f.close();
    }
}