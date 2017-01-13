package Concu_chapter06_01.hungry;

/**
 * Created by jamesmsw on 17-1-13.
 *
 * 立即加载/"饿汉模式"
 * 什么是立即加载?立即加载就是使用类的时候已经将对象创建完毕
 */
public class MyObject {
    private static MyObject myObject=new MyObject();
    private MyObject(){

    }
    public static MyObject getInstance(){
        return myObject;
    }
}
