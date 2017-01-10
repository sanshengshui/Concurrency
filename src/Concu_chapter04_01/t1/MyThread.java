package Concu_chapter04_01.t1;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
