/**
 * Created by jamesmsw on 16-12-4.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b","bb");
    }
}
