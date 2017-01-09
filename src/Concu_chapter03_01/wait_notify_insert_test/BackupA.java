package Concu_chapter03_01.wait_notify_insert_test;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class BackupA extends Thread {
    private DBTools dbTools;
    public BackupA(DBTools dbTools){
        super();
        this.dbTools=dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
