package Concu_chapter03_02.t1;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Test1 {
   public static void main(String[] args) throws InterruptedException {
       MyThread threadTest=new MyThread();
       threadTest.start();
       threadTest.join();
       System.out.println("我想当threadTest对象执行后我再执行，我做到了");

   }
}
