package Concu_chapter02_02.t5;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;

    }
    @Override
    public void run() {
       service.setUsernamePassword("b","bb");
    }
}
