package Concu_chapter03_02.t8;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadA a=new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b=new ThreadB();
            b.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
