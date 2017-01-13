package Concu_chapter06_01.dealwith_lazy;

/**
 * Created by jamesmsw on 17-1-13.
 */
public class MyObject1 {
    private static MyObject1 myObject1;
    private MyObject1(){

    }
    public static MyObject1 getInstance(){
        try{
            synchronized (MyObject1.class){
                if(myObject1!=null){

                }else {
                    Thread.sleep(3000);
                    myObject1=new MyObject1();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return myObject1;
    }
}
