package Concu_chapter04_02.t1;

/**
 * Created by jamesmsw on 17-1-12.
 */
public class Run {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        ThreadB b=new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
