package Concu_chapter01_01;

/**
 * Created by jamesmsw on 16-12-4.
 */
public class Run3 {
    public static void main(String[] args){
        MyThread3 myThread3=new MyThread3();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread3.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
