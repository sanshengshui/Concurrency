package Concu_chapter03_01.t7;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock=lock;

    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
