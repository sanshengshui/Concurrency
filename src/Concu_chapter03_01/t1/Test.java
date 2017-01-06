package Concu_chapter03_01.t1;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Test {
    public static void main(String[] args){
       MyList service=new MyList();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
