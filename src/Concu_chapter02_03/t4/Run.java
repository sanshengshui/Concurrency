package Concu_chapter02_03.t4;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Run {
    public static void main(String[] args){
        AddCountThread countThread=new AddCountThread();
        Thread t1=new Thread(countThread);
        t1.start();
        Thread t2=new Thread(countThread);
        t2.start();
        Thread t3=new Thread(countThread);
        t3.start();
        Thread t4=new Thread(countThread);
        t4.start();
        Thread t5=new Thread(countThread);
        t5.start();
    }
}
