package Concu_chapter04_01.t2;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class ThreadAA extends Thread{
    private MyService service;
    public ThreadAA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
