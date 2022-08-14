package work1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class SomeInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.getAnnotation(Selector.class).xpath();
    }
}