package Thread;

/**
 * Created by asus on 2018/12/5.
 */
public class ThreadTest {
    public static void main(String[] args)throws Exception {
        ThreadSample threadSample=new ThreadSample();
        for(int i=0;i<10;i++){
            Thread thread=new Thread(threadSample);
            thread.start();
            thread.join();
        }
        threadSample.printOutList();
    }
}
