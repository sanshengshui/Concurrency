package Concu_chapter02_02.t23;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Service {
    public void serviceMethodA(Userinfo userinfo){
        synchronized (userinfo){
            try {
                System.out.println(Thread.currentThread().getName());
                userinfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
