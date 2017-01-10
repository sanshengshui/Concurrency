package Concu_chapter04_01.t4;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Run {
    public static void main(String[] args){
        MyService myService=new MyService();
        MyThreadA a=new MyThreadA(myService);
        a.start();
    }
}
