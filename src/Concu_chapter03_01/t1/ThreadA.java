package Concu_chapter03_01.t1;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class ThreadA extends Thread {
    private MyList list;
    public ThreadA(MyList list){
        super();
        this.list=list;

    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                list.add();
                System.out.println("添加了"+(i+1)+" 个元素");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
