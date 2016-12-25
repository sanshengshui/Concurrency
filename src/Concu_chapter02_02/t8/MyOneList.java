package Concu_chapter02_02.t8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyOneList {
    private List list=new ArrayList();
    synchronized public void add(String data){
        list.add(data);
    }
    synchronized public int getSize(){
        return list.size();
    }
}
