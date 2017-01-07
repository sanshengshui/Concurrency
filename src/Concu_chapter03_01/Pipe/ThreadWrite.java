package Concu_chapter03_01.Pipe;

import java.io.PipedOutputStream;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;
    public ThreadWrite(WriteData write,PipedOutputStream out){
        super();
        this.write=write;
        this.out=out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
