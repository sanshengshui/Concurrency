package Concu_chapter04_01.t2;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Rrun {
    public static void main(String[] args) throws InterruptedException {
        MyService myService=new MyService();
        ThreadA a=new ThreadA(myService);
        a.setName("A");
        a.start();
        ThreadAA aa=new ThreadAA(myService);
        aa.setName("AA");
        aa.start();
        Thread.sleep(100);
        ThreadB b=new ThreadB(myService);
        b.setName("B");
        b.start();
        ThreadBB bb=new ThreadBB(myService);
        bb.setName("BB");
        bb.start();
    }
}
