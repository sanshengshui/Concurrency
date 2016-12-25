package Concu_chapter02_02.t7;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class Test {
    public static void main(String[] args){
        MyList myList=new MyList();
        MyThreadA a=new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b=new MyThreadB(myList);
        b.setName("B");
        b.start();

    }
}
