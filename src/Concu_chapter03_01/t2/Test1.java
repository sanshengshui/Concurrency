package Concu_chapter03_01.t2;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class Test1 {
    public static void main(String[] args){
        try {
            String newString=new String("");
            newString.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
