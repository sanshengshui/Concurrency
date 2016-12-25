package Concu_chapter02_02.t5;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class Run  {
    public static void main(String[] args){
        Service service=new Service();
        ThreadA a=new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service);
        b.setName("B");
        b.start();


    }
}
