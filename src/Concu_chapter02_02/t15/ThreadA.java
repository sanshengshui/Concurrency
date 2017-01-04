package Concu_chapter02_02.t15;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        service.print("AA");
    }
}
