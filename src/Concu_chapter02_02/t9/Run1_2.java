package Concu_chapter02_02.t9;

/**
 * Created by jamesmsw on 16-12-27.
 */
public class Run1_2 {
    public static void main(String[] args){
        Service service=new Service();
        MyObject object1=new MyObject();
        MyObject object2=new MyObject();
        ThreadA a=new ThreadA(service,object1);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service,object2);
        b.setName("b");
        b.start();

    }
}
