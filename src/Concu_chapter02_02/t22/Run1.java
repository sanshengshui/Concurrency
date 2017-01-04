package Concu_chapter02_02.t22;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService service =new MyService();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();

        b.start();


    }
}
