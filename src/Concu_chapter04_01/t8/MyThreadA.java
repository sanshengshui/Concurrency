package Concu_chapter04_01.t8;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class MyThreadA extends Thread {
    private MyService myService;
    public MyThreadA(MyService myService){
        super();
        this.myService=myService;

    }

    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++){
            myService.set();
        }
    }
}
