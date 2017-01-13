package Concu_chapter06_01.singleton;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyObject {
    private static class MyObjectHandler{
        private static MyObject myObject=new MyObject();
    }
    private MyObject(){

    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
