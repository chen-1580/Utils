package aop.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chen- on 2017-02-13.
 */
public abstract class AfterHandler extends AbstractHandler {

    public abstract void handleAfter(Object proxy, Method method, Object... args);

    public Object invoke(Object proxy, Method method, Object... args) throws InvocationTargetException, IllegalAccessException {
        Object result = method.invoke(getTargetObj(), args);
        handleAfter(proxy, method, args);
        return result;
    }
}
