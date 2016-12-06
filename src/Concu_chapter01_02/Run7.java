package Concu_chapter01_02;

/**
 * Created by james on 16-12-6.
 */
public class Run7 {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            MyThread7 thread7=new MyThread7();
            thread7.setPriority(1);
            thread7.start();
            MyThread8 thread8=new MyThread8();
            thread8.setPriority(10);
            thread8.start();

        }

    }
}
