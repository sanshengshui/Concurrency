package Concu_chapter02_02.t2;

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
        task.doLongTimeTask();
    }
}
