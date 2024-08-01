class myThread extends Thread{
    public void run(){
        System.out.println("Running...");
    }
}

public class Threads{
    public static void main(String []arg){
        myThread newthread = new myThread();
        newthread.start();
    }
}