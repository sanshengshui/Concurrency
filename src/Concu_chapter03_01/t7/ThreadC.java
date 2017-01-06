package Concu_chapter03_01.t7;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class ThreadC extends Thread {
    private Object lock;
    public ThreadC(Object lock){
        super();
        this.lock=lock;

    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
