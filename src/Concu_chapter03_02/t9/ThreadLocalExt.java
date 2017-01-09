package Concu_chapter03_02.t9;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值　第一次get不再为null";
    }
}
