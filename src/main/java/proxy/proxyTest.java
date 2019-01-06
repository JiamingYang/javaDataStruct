package proxy;

import java.lang.reflect.Proxy;

/**
 * Created by asus on 2018/12/1.
 */
public class proxyTest {
    public static void main(String[] args) {
        MyBusinessImpl testTarget=new MyBusinessImpl();
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler(testTarget);

        BusinessInterface businessInterface=(BusinessInterface) Proxy.newProxyInstance(testTarget.getClass().getClassLoader(),
                testTarget.getClass().getInterfaces(),myInvocationHandler);
        businessInterface.processBusiness();

    }
}
