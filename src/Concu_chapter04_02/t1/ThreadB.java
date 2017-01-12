package Concu_chapter04_02.t1;

/**
 * Created by jamesmsw on 17-1-12.
 */
public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.write();
    }
}
