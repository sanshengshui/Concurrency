package Concu_chapter02_02.t2;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class Task {

    public  void doLongTimeTask(){
        for(int i=0;i<100;i++){
            System.out.println("nosynchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i=0;i<100;i++){
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
