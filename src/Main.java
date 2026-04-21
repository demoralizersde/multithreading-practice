

public class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        Thread2 t = new Thread2();
        Thread t2 = new Thread(t);
        t2.start();

    // Using Lambda Function
        Thread t3 = new Thread(() -> {
            for(int i = 1000; i < 1200; i++){
                System.out.println(i);
            }
        });
        t3.start();
    }
}