package Concu_chapter01_02;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class MyThread3 extends Thread {
    @Override
    public void run() {
        super.run();
        try{
        for (int i=0;i<500000;i++){
            if(this.isInterrupted()){
                System.out.println("已经是停止状态了！我要退出了！");
                throw new InterruptedException();
            }
            System.out.println("i="+(i+1));
        }
    }catch (InterruptedException e){
    e.printStackTrace();}
    }
}
