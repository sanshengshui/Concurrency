package Concu_chapter02_02.t8;

/**
 * Created by jamesmsw on 16-12-25.
 */
public class MyService {
    public MyOneList addServiceMethod(MyOneList list,String data){
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);

                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
