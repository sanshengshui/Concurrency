package Concu_chapter02_02.t13;

/**
 * Created by jamesmsw on 17-1-3.
 */
public class Run {
    public static void main(String[] args){
        Service service1=new Service();
        Service service2=new Service();
        ThreadA a=new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b=new ThreadB(service2);
        b.setName("B");
        b.start();


    }
}
