package Concu_chapter03_01.t10;

/**
 * Created by jamesmsw on 17-1-7.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        Add add=new Add(lock);
        Subtract subtract=new Subtract(lock);
        ThreadSubtract subtract1=new ThreadSubtract(subtract);
        subtract1.setName("subtract1");
        subtract1.start();
        ThreadSubtract subtract2=new ThreadSubtract(subtract);
        subtract2.setName("subtract2");
        subtract2.start();
        Thread.sleep(1000);
        ThreadAdd addThread =new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
