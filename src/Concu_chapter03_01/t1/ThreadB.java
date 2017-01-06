package Concu_chapter03_01.t1;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class ThreadB extends Thread{
    private MyList list;
    public ThreadB(MyList list){
        super();
        this.list=list;
    }

    @Override
    public void run() {

            while(true){
                if(list.size()==5){
                    System.out.println("==5了,线程b要退出了！");

                }
            }

    }
}
