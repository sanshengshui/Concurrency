package Concu_chapter04_01.t6;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service=new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.signalAll();
    }
}
