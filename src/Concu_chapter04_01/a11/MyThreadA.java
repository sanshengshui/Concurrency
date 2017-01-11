package Concu_chapter04_01.a11;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class MyThreadA extends Thread {
    private Service service;
    public MyThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
