package Concu_chapter03_02.t11;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Run {
    public static void main(String[] args){
        try{
            for (int i=0;i<10;i++){
                System.out.println(" 在Main线程中取值="+Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a=new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
