package Concu_chapter02_02.t8;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyThread1 extends Thread {
    private MyOneList list;
    public MyThread1(MyOneList list){
        super();
        this.list=list;
    }
    @Override
    public void run() {
        MyService msRef=new MyService();
        msRef.addServiceMethod(list,"A");
    }
}
