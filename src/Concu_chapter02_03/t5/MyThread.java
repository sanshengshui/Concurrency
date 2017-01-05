package Concu_chapter02_03.t5;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class MyThread extends  Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
