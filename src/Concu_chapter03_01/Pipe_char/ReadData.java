package Concu_chapter03_01.Pipe_char;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ReadData {
    public void readMethod(PipedReader input){
        try{
            System.out.println("read :");
            char[] byteArray=new char[20];
            int readLength=input.read(byteArray);
            while(readLength!=1){
                String newData=new String(byteArray,0,readLength);
                System.out.println(newData);
                readLength=input.read(byteArray);
            }
            System.out.println();
            input.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
