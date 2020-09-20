import java.util.concurrent.TimeUnit;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyRunnable.java
 * @Description TODO
 * @createTime 2020年09月19日 13:32:00
 */
public class MyRunnable implements Runnable{


    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName()+"--------------------enter");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(currentThread.getName()+"-----------------leave");
        }
    }
}
