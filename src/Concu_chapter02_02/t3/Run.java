package Concu_chapter02_02.t3;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class Run {
    public static void main(String[] args){
        ObjectService service=new ObjectService();
        ThreadA a=new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("b");
        b.start();

    }
}
