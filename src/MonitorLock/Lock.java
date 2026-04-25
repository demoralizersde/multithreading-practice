package MonitorLock;

import java.sql.SQLOutput;

public class Lock {

    public synchronized void function1() throws InterruptedException {
        System.out.println("Before Sleeping");
        Thread.sleep(1000);
        System.out.println("Thread Awaken");
    }

    public void function2(){
        System.out.println("Before Acquiring Object Lock");
        System.out.println("Not able to acquire lock on object as the lock on object is already taken by function1");
        synchronized (this){
            System.out.println("Lock Acquired");
        }
    }

    public void function3(){
        System.out.println("Not Acquiring Any Lock");
    }
}
