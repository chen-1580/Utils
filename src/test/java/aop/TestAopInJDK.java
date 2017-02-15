package aop;

import aop.beans.Calculator;
import aop.beans.CalculatorImpl;
import aop.core.AbstractHandler;
import aop.core.AfterHandler;
import aop.core.BeforeHandler;
import aop.core.ProxyFactory;
import aop.core.impl.AfterHandlerImpl;
import aop.core.impl.BeforeHandlerImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen- on 2017-02-15.
 */
public class TestAopInJDK {

    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        BeforeHandler before = new BeforeHandlerImpl();
        AfterHandler after = new AfterHandlerImpl();
        List<AbstractHandler> handlers = new ArrayList<AbstractHandler>();
        handlers.add(before);
        handlers.add(after);
        Calculator proxy = (Calculator) ProxyFactory.getProxy(calcImpl,
                handlers);
        int result = proxy.calculate(20, 10);
        System.out.println("FInal Result :::" + result);
    }
}
