package Concu_chapter03_02.t10;

import java.util.Date;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return  new Date().getTime();
    }
}
