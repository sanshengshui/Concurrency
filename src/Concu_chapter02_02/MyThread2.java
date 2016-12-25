package Concu_chapter02_02;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task=task;

    }
    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2=System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2=System.currentTimeMillis();
    }
}
