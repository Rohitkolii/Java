class A extends Thread{
    public void run(){
        for(int i = 0; i< 100; i++){
            System.out.println("Running A...");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 0; i< 100; i++){
            System.out.println("Running B...");
        }
    }
}

public class Thread2{
    public static void main(String ...arg){
        A ob1 = new A();
        B ob2 = new B();
        
        ob1.start();
        ob2.start();
    }
}