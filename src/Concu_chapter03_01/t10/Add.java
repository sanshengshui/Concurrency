package Concu_chapter03_01.t10;

import com.sun.beans.decoder.ValueObject;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class Add {
    private String lock;
    public Add(String lock){
        super();
        this.lock=lock;
    }
    public void add(){
        synchronized (lock){
            Concu_chapter03_01.t10.ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
