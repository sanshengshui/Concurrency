package Concu_chapter02_02.t7;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyThreadA extends Thread {
    private MyList list;

    public MyThreadA(MyList list){
        super();
        this.list=list;

    }

    @Override
    public void run() {
       for(int i=0;i<100;i++){
           list.add("threadA"+(i+1));
       }
    }
}
