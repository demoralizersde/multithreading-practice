public class Thread2 implements Runnable{

    @Override
    public void run(){
        for(int i = 100; i < 120; i++){
            System.out.println(i);
        }
    }
}
