package aop.core.impl;

import aop.core.AfterHandler;

import java.lang.reflect.Method;

/**
 * Created by chen- on 2017-02-15.
 */
public class AfterHandlerImpl extends AfterHandler{

    @Override
    public void handleAfter(Object proxy, Method method, Object[] args) {
        //Provide your own cross cutting concern
        System.out.println("Handling after actual method execution ........");
    }
}
