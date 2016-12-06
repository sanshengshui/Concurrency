package Concu_chapter01_02;

/**
 * Created by james on 16-12-6.
 */
public class MyThread6 extends Thread {
    @Override
    public void run() {
        long beginTime=System.currentTimeMillis();
        int count=0;
        for(int i=0;i<50000000;i++){
            Thread.yield();
            /*
            yield方法的作用是放弃当前的cpu资源，将他让给其他的任务占用cpu执行时间
             */
            count=count+(i+1);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("用时: "+(endTime-beginTime)+"毫秒！");
    }
}
