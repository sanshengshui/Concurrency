package Concu_chapter02_02.t9;

/**
 * Created by jamesmsw on 16-12-27.
 */
public class Run1_1 {
    public static void main(String[] args){
        Service service=new Service();
        MyObject object=new MyObject();
        ThreadA a=new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}
