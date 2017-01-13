package Concu_chapter06_01.lazy;

/**
 * Created by jamesmsw on 17-1-13.
 *
 *延时加载/"懒汉模式"解析
 * 延时加载/"懒汉模式"是在调用方法是实例才被创建
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){

    }
    public static MyObject getInstanse(){
        if(myObject!=null){

        }else {
            myObject=new MyObject();
        }
        return myObject;
    }
}
