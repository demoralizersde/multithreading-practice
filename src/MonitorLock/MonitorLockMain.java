package MonitorLock;

import java.util.concurrent.ThreadPoolExecutor;

public class MonitorLockMain {

    public static void main(String[] args) {

        Lock lock = new Lock();
        Thread t1 = new Thread (() -> {
            try {
                lock.function1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            lock.function2();
        });

        Thread t3 = new Thread(() -> {
            lock.function3();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
