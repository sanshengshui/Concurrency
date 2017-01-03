package Concu_chapter02_02.t10;

/**
 * Created by jamesmsw on 16-12-27.
 */
public class MyObject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("speedPrintString __getLock time="+System.currentTimeMillis()+"run ThreadName="
                    +Thread.currentThread().getName());
            System.out.println("--------------------");
            System.out.println("speedPrintString releaseLock time="+System.currentTimeMillis()+" run ThreadName="
                    +Thread.currentThread().getName());
        }
    }
}
