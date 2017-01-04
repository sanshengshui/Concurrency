package Concu_chapter02_02.t17;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Run {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA athread=new ThreadA(service);
        athread.start();
        ThreadB bthread=new ThreadB(service);
        bthread.start();
    }
}
