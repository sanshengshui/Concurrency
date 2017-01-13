package Concu_chapter06_01.static_singleton;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyObject {
    private static MyObject instance=null;

    private MyObject(){

    }
    static {
        instance=new MyObject();
    }
    public static MyObject getInstance(){
        return instance;
    }
}
