package Concu_chapter03_01.Pipe_char;

import java.io.PipedReader;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedReader input;
    public ThreadRead(ReadData read,PipedReader input){
        super();
        this.read=read;
        this.input=input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
