package Concu_chapter04_01.a11;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Service service=new Service();
        MyThreadA myThreadA=new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB=new MyThreadB(service);
        myThreadB.start();
    }
}
