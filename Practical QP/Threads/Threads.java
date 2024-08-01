class Thread1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Java");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Programming");
        }
    }
}

class Threads{
    public static void main(String arg[]){
        Thread1 MyThread = new Thread1();
        Thread2 YourThread = new Thread2();

        MyThread.setPriority(7);
        YourThread.setPriority(7);

        MyThread.start();
        YourThread.start();
    }
}
