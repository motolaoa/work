package test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {
    //动态代理方法
    public static Calculator getProxy(final Calculator calculator) {
        ClassLoader classLoader = calculator.getClass().getClassLoader();

        Class<?>[] interfaces = calculator.getClass().getInterfaces();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    result = method.invoke(calculator, args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return result;
            }
        };
        Object o = Proxy.newProxyInstance(classLoader, interfaces, handler);
        return (Calculator) o;
    }
}
