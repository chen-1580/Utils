package aop.core;

import java.lang.reflect.InvocationHandler;

/**
 * Created by chen- on 2017-02-13.
 */
public abstract class AbstractHandler implements InvocationHandler{

    private Object targetObj;

    public void setTargetObj(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Object getTargetObj() {
        return targetObj;
    }

}
