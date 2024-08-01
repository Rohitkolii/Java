import java.util.Scanner;

public class input{
    public static void main(String ...str){
        System.out.print("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("Value is "+n);
    }
}