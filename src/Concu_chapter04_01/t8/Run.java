package Concu_chapter04_01.t8;

/**
 * Created by jamesmsw on 17-1-10.
 */
public class Run {
    public static void main(String[] args){
        MyService myService=new MyService();
        MyThreadA[] threadAs=new MyThreadA[10];
        MyThreadB[] threadBs=new MyThreadB[10];
        for (int i=0;i<10;i++){
            threadAs[i]=new MyThreadA(myService);
            threadBs[i]=new MyThreadB(myService);
            threadAs[i].start();
            threadBs[i].start();
        }
    }
}
