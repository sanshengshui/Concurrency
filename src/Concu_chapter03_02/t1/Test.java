package Concu_chapter03_02.t1;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Test {
    public static void main(String[] args){
        MyThread threadTest=new MyThread();
        threadTest.start();
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("当上面代码中的sleep()中的值应该写多少");
        System.out.println("答案是:根据不能确定:)");
    }
}
