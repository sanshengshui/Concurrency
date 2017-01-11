package Concu_chapter04_01.a5;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args){
        final Service service1=new Service(true);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();
    }
}
