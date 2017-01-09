package Concu_chapter03_01.oneproduct_oneconsume;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class P {
    private MyStack myStack;
    public P(MyStack myStack){
        super();
        this.myStack=myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
