package Concu_chapter04_01.t7;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
