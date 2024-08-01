import java.util.Scanner;
public class sumOfArraywithException{
    public static void main(String arg[]){
        int a[] = new int[20];

        Scanner n = new Scanner(System.in);
        int size = n.nextInt();
        try{
            for(int i=0; i<size; i++){
                a[i] = n.nextInt();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Size is only 20...");
        }
    }
}