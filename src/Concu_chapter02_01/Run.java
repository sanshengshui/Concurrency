package Concu_chapter02_01;
/*
方法内的变量为线程安全
 */

/**
 * Created by james on 16-12-6.
 */
public class Run {
    public static void main(String[] args){
        HasSelfPrivateNum numRef=new HasSelfPrivateNum();
        ThreadA athread=new ThreadA(numRef);
        athread.start();
        ThreadB bthread=new ThreadB(numRef);
        bthread.start();
    }
}
