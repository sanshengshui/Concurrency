package Concu_chapter04_01.a11;

/**
 * Created by jamesmsw on 17-1-11.
 */
public class Run1 {
    public static void main(String[] args){
        Service service=new Service();
        MyThreadA myThreadA=new MyThreadA(service);
        myThreadA.start();
    }
}
