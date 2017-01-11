package Concu_chapter04_01.a1;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service=new Service();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray=new Thread[10];
        for (int i=0;i<10;i++){
            threadArray[i]=new Thread(runnable);
        }
        for (int i=0;i<10;i++){
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notityMethod();
    }
}
