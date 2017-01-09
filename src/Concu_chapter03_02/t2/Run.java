package Concu_chapter03_02.t2;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
