package Concu_chapter03_01.oneproduct_oneconsume;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class C_Thread extends Thread {
    private C r;
    public C_Thread(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        while(true){
            r.popService();
        }
    }
}
