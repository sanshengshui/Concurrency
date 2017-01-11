package Concu_chapter04_01.a9;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run {
    public static void main(String[] args){
        final MyService service=new MyService();
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"调用waitMethod时间:"+System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA=new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB=new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
