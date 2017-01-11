package Concu_chapter04_01.a10;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class MyThread extends Thread {
    private Service service;
    public MyThread(Service service){
        super();
        this.service=service;

    }

    @Override
    public void run() {
        service.testMethod();
    }
}
