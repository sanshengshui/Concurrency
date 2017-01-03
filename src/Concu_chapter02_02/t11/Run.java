package Concu_chapter02_02.t11;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class Run {
    public static void main(String[] args){
        ThreadA a=new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB();
        b.setName("B");
        b.start();


    }
}
