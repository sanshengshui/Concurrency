package Concu_chapter03_01.oneproduct_oneconsume;



/**
 * Created by jamesmsw on 17-1-9.
 */
public class P_Thread extends Thread {
    private P p;
    public P_Thread(P p){
        super();
        this.p=p;

    }

    @Override
    public void run() {
        while(true){
            p.pushService();
        }
    }
}
