package Concu_chapter02_02.t14;

/**
 * Created by jamesmsw on 17-1-4.
 */
public class Service {
    public static void printA(){
        synchronized (Service.class){
            try {
                System.out.println("线程名称为: "+Thread.currentThread().getName()
                        +"在"+System.currentTimeMillis()+"进入printA");
                Thread.sleep(3000);
                System.out.println("线程名称为: "+Thread.currentThread().getName()
                        +"在"+System.currentTimeMillis()+"离开printA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printB(){
        synchronized (Service.class) {
            try {
                System.out.println("线程名称为: " + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "进入printB");
                Thread.sleep(3000);
                System.out.println("线程名称为: " + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "离开printB");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
