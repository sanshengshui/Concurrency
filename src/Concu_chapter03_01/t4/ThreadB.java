package Concu_chapter03_01.t4;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class ThreadB extends Thread {
    private Object lock;
    public ThreadB(Object lock){
        super();
        this.lock=lock;

    }

    @Override
    public void run() {
        Service service=new Service();
        service.testMethod(lock);
    }
}
