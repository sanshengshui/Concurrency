package Concu_chapter02_02.t4;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class Task {
    /*
    public void otherMethod(){
        System.out.println("---------------run--otherMethod");
    }
    */
    synchronized public void otherMethod(){
        System.out.println("---------------run--otherMethod");
    }
    public void doLongTimeTask(){
        synchronized (this){
            for(int i=0;i<100;i++){
                System.out.println("synchronized threadName="+
                Thread.currentThread().getName()+" i="+(i+1));
            }
        }
    }
}
