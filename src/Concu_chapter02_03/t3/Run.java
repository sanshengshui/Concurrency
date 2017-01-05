package Concu_chapter02_03.t3;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Run {
    public static void main(String[] args){
        MyThread[] myThreads=new MyThread[100];
        for (int i=0;i<100;i++){
            myThreads[i]=new MyThread();
        }
        for (int i=0;i<100;i++){
            myThreads[i].start();
        }
    }
}
