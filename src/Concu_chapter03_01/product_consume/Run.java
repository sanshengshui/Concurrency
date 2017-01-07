package Concu_chapter03_01.product_consume;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class Run {
    public static void main(String[] args){
        String lock=new String("");
        P p=new P(lock);
        C r=new C(lock);
        ThreadP pThread=new ThreadP(p);
        ThreadC rThread=new ThreadC(r);
        pThread.start();
        rThread.start();
    }
}
