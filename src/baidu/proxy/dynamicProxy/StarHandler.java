package baidu.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/2.
 */
public class StarHandler implements InvocationHandler{

    private Star star;

    public StarHandler(Star star) {
        super();
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object object = null;

        System.out.println("before");
        // 判断
        if(method.getName().equals("sing")){
            // invoke 调用方法，传入一个目标对象，和对应的对象参数
            object = method.invoke(star,args);
        }else {

        }

        System.out.println("after");
        return object;

    }
}
