package Concu_chapter04_01.t9;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class RunNotFair {
    public static void main(String[] args){
    final Service service=new Service(false);
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            System.out.println("*线程"+Thread.currentThread().getName()+"运行了");
            service.serviceMethod();
        }
    };
    Thread[] threadArray=new Thread[10];
        for(int j=0;j<10;j++){
        threadArray[j]=new Thread(runnable);
    }
        for (int j=0;j<10;j++){
        threadArray[j].start();
    }
}
}
