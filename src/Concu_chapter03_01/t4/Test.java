package Concu_chapter03_01.t4;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class Test {
    public static void main(String[] args){
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        ThreadB b=new ThreadB(lock);
        b.start();
    }
}
