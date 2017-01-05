package Concu_chapter02_03.t6;

/**
 * Created by jamesmsw on 17-1-5.
 */
public class Service {
    private boolean isContinueRun=true;
    public void runMethod(){
        String anyString=new String();
        while(isContinueRun==true){
            synchronized (anyString){

            }

        }
        System.out.println("停下来了!");

    }
    public void stopMethod(){
        isContinueRun=false;
    }
}
