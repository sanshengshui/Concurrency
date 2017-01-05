package Concu_chapter02_03.t1;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Run {
    public static void main(String[] args){
        PrintString printString=new PrintString();
        new Thread(printString).start();
        System.out.println("我要停止它！stopThread="+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
