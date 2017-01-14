package Concu_chapter07_01.formatError;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jamesmsw on 17-1-14.
 *
 */
public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;
    public MyThread(SimpleDateFormat sdf,String dateString){
        super();
        this.sdf=sdf;
        this.dateString=dateString;
    }

    @Override
    public void run() {
        try{
            Date dateRef=sdf.parse(dateString);
            String newDateString=sdf.format(dateRef).toString();
            if(!newDateString.equals(dateString)){
                System.out.println("ThreadName="+this.getName()+"报错了　日期字符串:"+dateString+" " +
                        "转换成的日期为："+newDateString);
            }

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
