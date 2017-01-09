package Concu_chapter03_02.t11;

import java.util.Date;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return  new Date().getTime();

    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+" 我在子程序加的～！";
    }
}
