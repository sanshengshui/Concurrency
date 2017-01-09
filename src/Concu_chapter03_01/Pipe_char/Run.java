package Concu_chapter03_01.Pipe_char;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.nio.channels.Pipe;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class Run {



        public static void main (String[]args){


            try {
                WriteData writeData = new WriteData();
                ReadData readData = new ReadData();

                PipedReader pipedReader = new PipedReader();
                PipedWriter pipedWriter = new PipedWriter();
                pipedWriter.connect(pipedReader);

                ThreadRead threadRead=new ThreadRead(readData,pipedReader);
                threadRead.start();
                Thread.sleep(2000);
                ThreadWrite threadWrite=new ThreadWrite(writeData,pipedWriter);
                threadWrite.start();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


}
