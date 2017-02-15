package aop.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chen- on 2017-02-13.
 */
public abstract class BeforeHandler extends AbstractHandler {

    public abstract void handleBefore(Object proxy, Method method, Object... args);

    public Object invoke(Object proxy, Method method, Object... args) throws InvocationTargetException, IllegalAccessException {
        handleBefore(proxy, method, args);
        return method.invoke(getTargetObj(), args);
    }
}
