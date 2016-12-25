package Concu_chapter02_02.t2;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyThread1 extends  Thread {
    private Task task;

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }

    public MyThread1(Task task){
        super();
        this.task=task;
    }
}
