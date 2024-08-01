import java.util.Scanner;
class Stack{
    public void push(int a, int s[],int top){
        top++;
        s[top] = a;
    }

    public void pop(int top){
        top--;
    }

    public void Display(int s[], int top){
        for(int i=0; i<top; i++){
            System.out.println(s[i]);
        }
    }

    public static void main(String arg[]){

        Stack s = new Stack();

        int A[] = new int[5];
        int top=-1, n, n2;

        System.out.println("Eneter 1 to go ahead...");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        while(n==1){
            System.out.println("Enter 2 for Push & 3 for Pop...");
            n2=in.nextInt();
            switch(n2){
                case 2:
                    System.out.println("Enter Value to Push...");
                    n2=in.nextInt();
                    s.push(n,A,top);
                    break;
                case 3:
                    s.pop(top);
                    break;
                case 4:
                    s.Display(A, top);
                    break;
            }
        }
    }
}