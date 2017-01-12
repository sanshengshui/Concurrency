package Concu_chapter05_01.t3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jamesmsw on 17-1-12.
 */
public class Run {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了!时间为:"+new Date());
        }
    }

    public static void main(String[] args){
        try {
            MyTask task=new MyTask();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString="2017-01-12 10:23:00";
            Timer timer=new Timer();
            Date dateRef=sdf.parse(dateString);
            System.out.println("字符串时间:"+dateRef.toLocaleString()+" 当前时间:"+new Date().toLocaleString());
            timer.schedule(task,dateRef,4000);

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
