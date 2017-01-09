package Concu_chapter03_01.Pipe_char;

import java.io.PipedWriter;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedWriter out;
    public ThreadWrite(WriteData writeData,PipedWriter out){
        super();
        this.writeData=writeData;
        this.out=out;
    }


    @Override
    public void run() {
        writeData.WriteMethod(out);
    }
}
