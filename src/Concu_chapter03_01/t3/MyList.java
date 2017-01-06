package Concu_chapter03_01.t3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamesmsw on 17-1-6.
 */
public class MyList {
    private static List list=new ArrayList();
    public static void add(){
        list.add("anyString");
    }
    public static int size(){
        return list.size();
    }
}
