package Concu_chapter03_01.t7;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock){
            lock.notifyAll();

        }
    }
}
