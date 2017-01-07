package Concu_chapter03_01.Pipe;

import java.io.PipedInputStream;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read,PipedInputStream input){
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
