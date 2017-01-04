package Concu_chapter02_02.t15;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Run {
    public static void main(String[] agrs){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
