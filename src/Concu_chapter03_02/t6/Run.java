package Concu_chapter03_02.t6;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Run {
    public static ThreadLocal t1=new ThreadLocal();
    public static void main(String[] args){
        if(t1.get()==null){
            System.out.println("从没放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
