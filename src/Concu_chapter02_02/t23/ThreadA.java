package Concu_chapter02_02.t23;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class ThreadA extends Thread {
    private Service service;
    private Userinfo userinfo;
    public ThreadA(Service service,Userinfo userinfo){
        super();
        this.service=service;
        this.userinfo=userinfo;
    }

    @Override
    public void run() {
        service.serviceMethodA(userinfo);
    }
}
