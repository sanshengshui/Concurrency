package Concu_chapter04_01.a7;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final MyService service=new MyService();
        Runnable runnableRef=new Runnable() {
            @Override
            public void run() {
              service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnableRef);
        threadA.setName("A");
        threadA.start();
        Thread threadB=new Thread(runnableRef);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end!");
    }
}
