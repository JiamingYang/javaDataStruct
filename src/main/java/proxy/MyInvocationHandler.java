package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by asus on 2018/12/1.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object object=null;
    MyInvocationHandler(Object target){
        this.object=target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("开始处理工作之前\n");
        Object result=method.invoke(object,args);
        System.out.print("工作处理完成\n");
        return null;
    }
}
