package Concu_chapter04_01.t1;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Run {
    public static void main(String[] args){
        MyService service=new MyService();
        MyThread a1=new MyThread(service);
        MyThread a2=new MyThread(service);
        MyThread a3=new MyThread(service);
        MyThread a4=new MyThread(service);
        MyThread a5=new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

    }
}
