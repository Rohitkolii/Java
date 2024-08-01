import java.util.Scanner;

public class Matrix_Multiplication{
    public static void main(String arg[]){
        int mm[][] = new int[3][3];
        int mn[][] = new int[3][3];
        int mmm[][] = new int[3][3];
        int sum = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Matrix 1");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter index : " + (i+1) +" "+ (j+1));
                mm[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix 2");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter index : " + (i+1) +" "+ (j+1));
                mn[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum = mm[i][j] * mn[i][j];
                for(int k=0; k<3; k++){
                    mmm[i][j] += sum; 
                }
            }
        }

        System.out.println("Matrix Multiplication : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(mmm[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}