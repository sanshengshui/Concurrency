package Concu_chapter06_01.DCL;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyObject {
    private volatile static MyObject myObject;
    private MyObject(){

    }
    public static MyObject getInstance(){
        try{
            if (myObject!=null){
            }else {
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(myObject==null){
                        myObject=new MyObject();
                    }
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject;
    }
}
