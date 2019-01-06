package Thread;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2018/12/5.
 */
public class ThreadSample implements Runnable {
    private List list=new ArrayList();
    public void run() {
        synchronized (list){
            list.add(System.currentTimeMillis());
        }
    }
    public  void printOutList(){
        int length=list.size();
        for(int i=0;i<length;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
