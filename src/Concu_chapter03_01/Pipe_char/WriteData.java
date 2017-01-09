package Concu_chapter03_01.Pipe_char;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class WriteData {
    public void WriteMethod(PipedWriter out){
        try{
            System.out.println("write　:");
            for (int i=0;i<300;i++){
                String outData=""+(i+1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
