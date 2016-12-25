package Concu_chapter02_02.t8;



/**
 * Created by jamesmsw on 16-12-25.
 */
public class Run {
    public  static void main(String[] args) throws InterruptedException {
        MyOneList list=new MyOneList();
        MyThread1 myThread1=new MyThread1(list);
        myThread1.setName("A");
        myThread1.start();
        MyThread2 myThread2=new MyThread2(list);
        myThread2.setName("B");
        myThread2.start();
        Thread.sleep(6000);
        System.out.println("listSize="+list.getSize());

    }
}
