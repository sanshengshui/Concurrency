package Concu_chapter03_01.oneproduct_oneconsume;

/**
 * Created by jamesmsw on 17-1-9.
 */
public class C {
    private MyStack myStack;
    public C(MyStack myStack){
        super();
        this.myStack=myStack;

    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
