package aop.core.impl;

import aop.core.AfterHandler;
import aop.core.BeforeHandler;

import java.lang.reflect.Method;

/**
 * Created by chen- on 2017-02-15.
 */
public class BeforeHandlerImpl extends BeforeHandler{

    @Override
    public void handleBefore(Object proxy, Method method, Object... args) {
        System.out.println("Handling before actual method execution ........");
    }

}
